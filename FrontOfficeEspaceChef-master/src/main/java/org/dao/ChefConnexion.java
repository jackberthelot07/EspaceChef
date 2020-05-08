package org.dao;

import com.mongodb.*;

import java.util.ArrayList;

public class ChefConnexion {
    private static final DB conn = ConnexionMBD.mdbConnexion("test");
    private  DBCollection dbCollection = conn.getCollection("procedures");
    public  boolean validationChefDeDivision(String nom, String password)
    {
        DBCursor dbCursor = dbCollection.find();
        while (dbCursor.hasNext())
        {
            DBObject dbObject = dbCursor.next();
            DBObject dbObject1 = (DBObject) dbObject.get("division");
            DBObject dbObject2 = (DBObject) dbObject1.get("chefDivision");
            String name  = (String) dbObject2.get("nom");
            String pass = (String) dbObject2.get("password");
            if (name.equals(nom) && pass.equals(password))
                return true;

        }
        return false;
    }

}
