package ibf2022.paf.assessment.server.repositories;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;
// import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import ibf2022.paf.assessment.server.Utils;
import ibf2022.paf.assessment.server.models.User;

// Task 3

@Repository
public class UserRepository {


    public static final String SQL_FIND_USER_BY_USERNAME = """
		SELECT * FROM user WHERE username = ?
		""";

	public static final String SQL_INSERT_USER = """
		INSERT INTO user (user_id, username, name) VALUES (?, ?, ?)
			""";


    @Autowired
    JdbcTemplate template;

    public Optional<User> findUserByUsername(String username) {
        SqlRowSet rs = template.queryForRowSet(SQL_FIND_USER_BY_USERNAME, username);
		if (!rs.next())
			return Optional.empty();
		return Optional.of(Utils.toUser(rs));
	}

	public String insertUser(User user) {
		template.update(SQL_INSERT_USER, user.getUserId(), user.getUsername(), user.getName());
        String userId = user.getUserId();
        return userId;
	}


	public Boolean createUser(User user) {
        Boolean bCreated = false;
        template.execute(SQL_INSERT_USER, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1, user.getUserId());
                ps.setString(2, user.getUsername());
                ps.setString(3, user.getName());
                Boolean result = ps.execute();
                return result;
            }
        });
        return bCreated;
    }









}
