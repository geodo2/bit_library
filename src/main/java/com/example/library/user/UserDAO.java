package com.example.library.user;

import com.example.library.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    // 가입 여부 확인 및 가입 메서드
    public boolean checkUserExists(String username) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM Users WHERE username = ?")) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 아이디 존재 여부 확인 메서드


    // 유저 가입 메서드
    public void registerUser(String username, String password, String phone, String email) {
        // 데이터베이스에 유저 정보를 저장하는 로직
        // ...
    }

    // 비밀번호, 이메일, 전화번호 일치 여부 확인 메서드
    public boolean checkCredentials(String username, String password, String phone, String email) {
        // 데이터베이스에서 해당 유저 정보를 조회하는 로직
        // ...

        // 예시로 항상 false를 반환하도록 설정
        return false;
    }
}
