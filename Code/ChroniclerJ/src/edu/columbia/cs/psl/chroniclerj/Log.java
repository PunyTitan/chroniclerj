package edu.columbia.cs.psl.chroniclerj;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Log {
	public static Object[] aLog = new Object[Constants.DEFAULT_LOG_SIZE];
	public static String[] aLog_owners = new String[Constants.DEFAULT_LOG_SIZE];
	public static Lock logLock = new ReentrantLock();
	public static int logsize = 0;
	public static int aLog_fill;

	
	public static void clearLog() {
		logsize = 0;
		aLog = new Object[Constants.DEFAULT_LOG_SIZE];
		aLog_owners = new String[Constants.DEFAULT_LOG_SIZE];
		
		aLog_fill = 0;
		
	}
}
