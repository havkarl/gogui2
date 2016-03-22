package net.sf.gogui.version;


public final class Version
{
	/** Get version for packages in net.sf.gogui.
	 @return Version string, no assumptions about the format should be
	 made.
	 */
	public static String get()
	{
		return "GoGui v2.0";
	}

	/** Make constructor unavailable; class is for namespace only. */
	private Version() {}
}
