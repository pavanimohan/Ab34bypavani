package Testing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
//retry test cases will used for fail testcases
public class ConIRetry implements IRetryAnalyzer{
int count=0;//initial count
int retrytimes=5;//max count  i need retrytimes is a variable we can take anything as a varible count also not fix
	@Override
	public boolean retry(ITestResult result) {
if (count<retrytimes)
{
	count++;

	return true;
	
}
return false;//it will stop the retry logic
	}
	
	

}
