package com.sqa.ec;

import org.openqa.selenium.*;

public interface IAutomationError
{
	// variables are not supported in interfaces only constant are supported
	// abstract final static String errorName;

	// abstract public do not need to be typed up, by default, it's there
	abstract public void createErrorReport();

	abstract public WebDriver evalUsedDriver();

	abstract public void recreateError();

	abstract int getErrorId();

	abstract int getNumOfOccurences();

	abstract String getTimeStamp();

	abstract void setErrorId(int errorId);

	abstract void setNumOfOccurences(int numOfOccurences);

	abstract void setTimeStamp(String timeStamp);
}
