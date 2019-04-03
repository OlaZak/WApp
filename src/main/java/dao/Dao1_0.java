package dao;
import utils.Connector;
import utils.Queries1_0;

import java.sql.*;
import java.util.ArrayList;

public class Dao1_0 {

//    public static ArrayList<Market1_0> getMarketList(){
//        ArrayList<Market1_0> markets = new ArrayList<>();
//        try {
//            Statement statement = Connector.getConnection().createStatement();
//            ResultSet rs = statement.executeQuery(Queries1_0.GET_ALL_MARKETS);
//            while (rs.next()){
//                markets.add(new Market1_0(rs.getInt("ID"), rs.getString("MARKET_NAME")));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//        //    Connector.closeConnection();
//        }
//        return markets;
//    }
//
//    public  static Market1_0 getMarketById(int id){
//        Market1_0 market = new Market1_0();
//        try {
//        PreparedStatement ps = Connector.getConnection().prepareStatement(Queries1_0.GET_MARKET_BY_ID_PARAM);
//        ps.setInt(1,id);
//        ResultSet resultSet = ps.executeQuery();
//        while (resultSet.next()){
//        market.setId(resultSet.getInt("ID"));
//        market.setNameMarket(resultSet.getString(2));
//        }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//         //   Connector.closeConnection();
//        }
//        return market;
//    }
//
//    public static ArrayList<Product1_0> getProductList(){
//        ArrayList<Product1_0> products = new ArrayList<>();
//        try {
//            Statement statement = Connector.getConnection().createStatement();
//            ResultSet rs = statement.executeQuery(Queries1_0.GET_PRODUCT_LIST);
//            while (rs.next()){
//                products.add(new Product1_0(rs.getInt("ID"),
//                        rs.getString("NAME"),
//                        rs.getInt("ID_MARKET")));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//           // Connector.closeConnection();
//        }
//        return products;
//    }
//
//    public static Product1_0 getProductById(int id){
//        Product1_0 product = new Product1_0();
//        try {
//            Statement statement = Connector.getConnection().createStatement();
//            ResultSet resultSet = statement.executeQuery(Queries1_0.GET_PRODUCTS_BY_ID(id));
//            while (resultSet.next()){
//                product.setName(resultSet.getString("NAME"));
//                product.setId(resultSet.getInt("ID"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//           // Connector.closeConnection();
//        }
//        return product;
//    }
//
//    public static void executeQuery(String query){
//    {
//        try {
//           Statement statement = Connector.getConnection().createStatement();
//            statement.execute(query);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//           // Connector.closeConnection();
//        }
//    }
//    }
}


