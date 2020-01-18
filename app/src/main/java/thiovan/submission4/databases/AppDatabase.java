package thiovan.submission4.databases;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import thiovan.submission4.dao.FavoriteDao;
import thiovan.submission4.models.Movie;
import thiovan.submission4.models.TvShow;

@Database(entities = {Movie.class, TvShow.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DB = "mydb";

    public abstract FavoriteDao getFavoriteDao();
}
