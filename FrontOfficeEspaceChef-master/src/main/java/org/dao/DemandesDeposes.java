package org.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import org.metier.beans.Demandes;

import java.util.ArrayList;

public class DemandesDeposes {
    private static final DB conn = ConnexionMBD.mdbConnexion("test");
    private DBCollection dbCollection1 = conn.getCollection("proceduresLancées");
    private DBCollection dbCollection2 = conn.getCollection("procedures");


    public ArrayList<Demandes> getAllDemandes (int idDivision)
    {
        ArrayList<Demandes> procedures = new ArrayList<>();
        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.put("division.id",idDivision);
        //DBCursor dbCursor = dbCollection.find(basicDBObject);
        return null;
    }

    private ArrayList<Integer> getAllId()
    {
        return null;
    }
}
