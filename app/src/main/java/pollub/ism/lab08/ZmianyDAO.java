package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ZmianyDAO {

    @Query("INSERT INTO Historia (veg_key, DATE, TIME, OLDQUANTITY,NEWQUANTITY) VALUES (:wybraneWarzywoID, CURRENT_DATE, CURRENT_TIME, :staraWartosc, :nowaWartosc)")
    void insertHistory(int wybraneWarzywoID, int staraWartosc, int nowaWartosc);

    @Query("SELECT * FROM Historia WHERE veg_key= :wybraneWarzywoID")
    List<Zmiany> findHistoryByID(int wybraneWarzywoID);
}