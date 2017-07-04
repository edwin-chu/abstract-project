/**
 * File Name: AbstractTestOperation.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 3, 2017
 */
package com.sqa.ec;

/**
 * AbstractTestOperation //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public abstract class AbstractTestOperation implements ITestOperation
{

	@Override
	public void performTest()
	{
		System.out.println(this.getClass().getSimpleName() + " perform a test operation");
	}
}
