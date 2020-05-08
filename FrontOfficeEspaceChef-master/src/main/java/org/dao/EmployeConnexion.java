package org.dao;

import com.mongodb.*;

import java.util.ArrayList;

public class EmployeConnexion {
    private static final DB conn = ConnexionMBD.mdbConnexion("test");
    private DBCollection dbCollection = conn.getCollection("procedures");

    public boolean validationEmploye(String nom, String password)
    {
        DBCursor dbCursor = dbCollection.find();
        while (dbCursor.hasNext())
        {
            DBObject dbObject = dbCursor.next();
            DBObject dbObject1 = (DBObject) dbObject.get("division");
            ArrayList<DBObject> allEmployes = (ArrayList<DBObject>) dbObject1.get("employes");
            for (DBObject object: allEmployes)
            {
                String name  = (String) object.get("nom");
                String pass = (String) object.get("password");
               if (name.equals(nom) && pass.equals(password))
                    return true;
            }
        }
        return false;
    }

}
