package org.codehaus.mojo.unix;

/**
 * @author <a href="mailto:trygve.laugstol@arktekk.no">Trygve Laugst&oslash;l</a>
 * @version $Id$
 */
public class MissingSettingException
    extends Exception
{
    private String setting;

    public MissingSettingException( String setting )
    {
        super( "Missing required setting: " + setting );
        this.setting = setting;
    }

    public String getSetting()
    {
        return setting;
    }
}
