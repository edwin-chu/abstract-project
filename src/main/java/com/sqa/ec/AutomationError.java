package com.sqa.ec;

import org.openqa.selenium.*;

public class AutomationError extends AbstractTestOperation implements IAutomationError
{

	private int errorId;

	private int numOfOccurences;

	private String timeStamp;

	@Override
	public void createErrorReport()
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see com.sqa.ec.ITestOperation#debugTest()
	 */
	@Override
	public void debugTest()
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see com.sqa.ec.AbstractTestOperation#debugTest()
	 */
	@Override
	public WebDriver evalUsedDriver()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the errorId
	 */
	@Override
	public int getErrorId()
	{
		return this.errorId;
	}

	/**
	 * @return the numOfOccurences
	 */
	@Override
	public int getNumOfOccurences()
	{
		return this.numOfOccurences;
	}

	/**
	 * @return the timeStamp
	 */
	@Override
	public String getTimeStamp()
	{
		return this.timeStamp;
	}

	/**
	 * @see com.sqa.ec.ITestOperation#performTest()
	 */
	@Override
	public void performTest()
	{
		System.out.println(this.getClass().getSimpleName() + " perform a test operation");
	}

	@Override
	public void recreateError()
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @param errorId
	 *            the errorId to set
	 */
	@Override
	public void setErrorId(int errorId)
	{
		this.errorId = errorId;
	}

	/**
	 * @param numOfOccurences
	 *            the numOfOccurences to set
	 */
	@Override
	public void setNumOfOccurences(int numOfOccurences)
	{
		this.numOfOccurences = numOfOccurences;
	}

	/**
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	@Override
	public void setTimeStamp(String timeStamp)
	{
		this.timeStamp = timeStamp;
	}
}
