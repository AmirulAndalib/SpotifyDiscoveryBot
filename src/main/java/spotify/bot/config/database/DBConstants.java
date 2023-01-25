package spotify.bot.config.database;

class DBConstants {

	private DBConstants() {
	}

	// Database constants
	public final static String TABLE_CACHE_RELEASES = "cache_releases";
	public final static String COL_RELEASE_ID = "release_id";
	
	public final static String TABLE_CACHE_RELEASES_NAMES = "cache_releases_names";
	public final static String COL_RELEASE_NAME = "release_name";

	public final static String TABLE_CACHE_ARTISTS = "cache_artists";
	public final static String COL_ARTIST_ID = "artist_id";

	public final static String TABLE_CONFIG_STATIC = "config_static";
	public final static String COL_LOOKBACK_DAYS = "lookback_days";
	public final static String COL_NEW_NOTIFICATION_TIMEOUT = "new_notification_timeout_days";
	public final static String COL_ARTIST_CACHE_TIMEOUT = "artist_cache_timeout_days";
	public final static String COL_ARTIST_CACHE_LAST_UPDATE = "artist_cache_last_update";

	public final static String TABLE_CONFIG_USER_OPTIONS = "config_user_options";
	public final static String COL_INTELLIGENT_APPEARS_ON_SEARCH = "intelligent_appears_on_search";
	public final static String COL_CIRCULAR_PLAYLIST_FITTING = "circular_playlist_fitting";
	public final static String COL_EP_SEPARATION = "ep_separation";
	public final static String COL_REMIX_SEPARATION = "remix_separation";
	public final static String COL_LIVE_SEPARATION = "live_separation";
	public final static String COL_RERELEASE_SEPARATION = "rerelease_separation";

	public final static String TABLE_PLAYLIST_STORE = "playlist_store";
	public final static String COL_ALBUM_GROUP = "album_group";
	public final static String COL_PLAYLIST_ID = "playlist_id";
	public final static String COL_LAST_UPDATE = "last_update";

	public final static String TABLE_BLACKLISTED_TYPES = "blacklisted_types";
	public final static String COL_BLACKLISTED_TYPES = "blacklisted_types";
}
