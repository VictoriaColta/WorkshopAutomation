package utils;

import java.util.Properties;

public class DataLoader {
        private final Properties properties;
        private static DataLoader dataLoader;

        private DataLoader(){
            properties = PropertyUtils.propertyLoader("src/main/resources/data.properties");
        }

        public static DataLoader getInstance(){
            if(dataLoader == null){
                dataLoader = new DataLoader();
            }
            return dataLoader;
        }

    public String getUser(){
        String prop=properties.getProperty("user");
        if(prop!=null)return prop;
        else throw new RuntimeException("Property user is not specified in .properties file");
    }
    public String getPassword(){
        String prop=properties.getProperty("password");
        if(prop!=null)return prop;
        else throw new RuntimeException("Property password is not specified in .properties file");
    }
    public String getbaseUrl(){
        String prop=properties.getProperty("base_url");
        if(prop!=null)return prop;
        else throw new RuntimeException("Property base_url is not specified in .properties file");
    }

    public String getApiKey(){
        String prop=properties.getProperty("api_key");
        if(prop!=null)return prop;
        else throw new RuntimeException("Property api_key is not specified in .properties file");
    }


}
