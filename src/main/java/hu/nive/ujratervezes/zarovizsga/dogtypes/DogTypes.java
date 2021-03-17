package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        String sql = "SELECT name FROM dog_types WHERE country = ? ORDER BY name;";
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, country.toUpperCase());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<String> listToReturn = new ArrayList<>();
            while (resultSet.next()) {
                listToReturn.add(resultSet.getString(1));
            }
            return listToReturn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
