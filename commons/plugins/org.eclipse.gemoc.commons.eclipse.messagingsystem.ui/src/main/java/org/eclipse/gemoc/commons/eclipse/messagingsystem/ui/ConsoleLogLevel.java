/*******************************************************************************
 * Copyright (c) 2011, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem.Kind;

public class ConsoleLogLevel{
	public static final int 	DEV_DEBUG = 1;
	public static final int 	DEV_INFO= 2;
	public static final int 	DEV_WARNING = 3;
	public static final int 	DEV_ERROR = 4;
	public static final int 	USER_INFO= 8;
	public static final int 	USER_WARNING = 9;
	public static final int 	USER_ERROR = 10;
	
	public static boolean isLevelEnoughToLog(Integer requiredLevel, Integer allowedLevel){
		return requiredLevel>=allowedLevel;
	}
	
	public static String level2String(Integer level){
		switch(level){
		case DEV_DEBUG :
			return "DEV_DEBUG";
		case DEV_INFO :
			return "DEV_INFO";
		case DEV_WARNING :
			return "DEV_WARNING";
		case DEV_ERROR :
			return "DEV_ERROR";
		case USER_INFO :
			return "USER_INFO";
		case USER_WARNING :
			return "USER_WARNING";
		case USER_ERROR :
			return "USER_ERROR";
		default:
			return "";
		}
	}
	public static int String2Level(String s){
		if(s.equals("DEV_DEBUG")) 	return DEV_DEBUG;
		if(s.equals("DEV_INFO")) 	return DEV_INFO;
		if(s.equals("DEV_WARNING")) return DEV_WARNING;
		if(s.equals("DEV_ERROR"))	return DEV_ERROR;
		if(s.equals("USER_INFO")) 	return USER_INFO;
		if(s.equals("USER_WARNING"))return USER_WARNING;
		if(s.equals("USER_ERROR")) 	return USER_ERROR;
		return DEV_DEBUG;
	}
	
	public static int kind2Level(Kind msgKind){
		switch (msgKind) {
		case DevDEBUG:
			return DEV_DEBUG;
		case UserINFO:
			return USER_INFO;
		case DevINFO:
			return DEV_INFO;
		case UserWARNING:
			return USER_WARNING;
		case DevWARNING:
			return DEV_WARNING;
		case UserERROR:
			return USER_ERROR;
		case DevERROR:
			return DEV_ERROR;
			
		default:
			return DEV_DEBUG;
		}
	}
}