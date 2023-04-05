package ibf2022.paf.assessment.server.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import ibf2022.paf.assessment.server.models.User;
import ibf2022.paf.assessment.server.Utils;

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

	public void insertUser(User user) {
		template.update(SQL_INSERT_USER, user.getUserId(), user.getUsername(), user.getName());

	}













}
