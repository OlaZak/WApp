package utils;

import model.Market1_0;
import model.Product1_0;

public class Queries1_0 {
    public static final String  CREATE_PRODUCTS_TABLE = "CREATE TABLE db.products(\n" +
            "ID INT NOT NULL AUTO_INCREMENT,\n" +
            "NAME VARCHAR (45) NULL ,\n" +
            "PRIMARY KEY (ID)\n" +
            ");";
    public static final String DELETE_PRODUCTS_TABLE = "DROP TABLE db.products";

    public static final String ADD_COLUMN_ID_MARKET = "ALTER TABLE db.products ADD ID_MARKET varchar (255);";

    public static final String CREATE_PRODUCT (Product1_0 product){
        return "INSERT INTO db.products (NAME) values ('"+product.getName()+"')";
    }

    public static final String CREATE_MARKET(Market1_0 market){
        return "INSERT INTO db.markets (MARKET_NAME) values ('"+market.getNameMarket()+"')";
    }

    public static final String CREATE_MARKET_TABLE = "CREATE TABLE db.markets (\n" +
            " ID INT NOT NULL AUTO_INCREMENT,\n" +
            " MARKET_NAME VARCHAR (255),\n" +
            " PRIMARY KEY (ID)\n" +
            ");";

    public  static final String UPDATE_MARKET(Market1_0 market){
        return "UPDATE db.markets SET " +
                "MARKET_NAME = '"+ market.getNameMarket() + "'" +
                "WHERE ID = '"+ market.getId() + "';";
    }

    public static final String DELETE_MARKET (int id){
        return "DELETE FROM db.markets WHERE ID = '" + id + "'";
    }

    public static final String UPDATE_PRODUCT(Product1_0 product){
        return  "UPDATE db.products SET " +
                "NAME = '"+product.getName()+"' " +
                ",ID_MARKET = '"+ product.getMarketId()+"'" +
                "WHERE ID = '"+product.getId()+"' ";
    }
    public static final  String GET_ALL_MARKETS = "SELECT * FROM db.markets";

    public static final String GET_MARKET_BY_ID_PARAM = "SELECT * FROM db.markets WHERE ID = ?";

    public static final String GET_PRODUCTS_BY_ID(int id) {
        return "SELECT * FROM db.products where ID = '" + id + "'   ";
    }

    public static final String GET_PRODUCT_LIST = "SELECT * FROM db.products";
}
