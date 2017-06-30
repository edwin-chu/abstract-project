/**
 * File Name: Core.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 28, 2017
 */
package com.sqa.ec.auto;

import org.openqa.selenium.*;
import org.testng.log4testng.*;

/**
 * Core //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class Core
{

	private String baseURL;

	private WebDriver driver;

	private Logger log = Logger.getLogger(this.getClass());

	/**
	 * @param baseURL
	 * @param driver
	 */
	public Core(String baseURL, WebDriver driver)
	{
		super();
		this.baseURL = baseURL;
		this.driver = driver;
	}

	/**
	 * @return the baseURL
	 */
	public String getBaseURL()
	{
		return this.baseURL;
	}

	/**
	 * @return the driver
	 */
	public WebDriver getDriver()
	{
		return this.driver;
	}

	/**
	 * @return the log
	 */
	public Logger getLog()
	{
		return this.log;
	}

	public boolean isPresent(By by)
	{
		return AutoBasics.isElementPresent(getDriver(), by, getLog());
	}
}
