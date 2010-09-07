/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.fede.workspace.as.test;

import java.io.File;

import junit.framework.TestSuite;


import fr.imag.adele.cadse.core.oper.WSOperation;
import fr.imag.adele.cadse.util.IProgressMonitor;
import fr.imag.adele.fede.workspace.as.operationfactory.IOperationFactory;

/**
 * 
 */
public interface ITest {

	/** return true if the test is enable */
	public boolean isEnableTests();

	/**
	 * Checks if is recorded tests.
	 * 
	 * @return true, if is recorded tests
	 */
	public boolean isRecordedTests();

	public boolean isTest(File f);

	/**
	 * Record test.
	 * 
	 * @param directory
	 *            the directory
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param pm
	 *            the pm
	 * 
	 * @throws TestException
	 *             the melusine exception
	 */
	public void recordTest(File directory, String name, String description, IProgressMonitor pm) throws TestException;

	/**
	 * Finish record test.
	 */
	public void finishRecordTest();

	/**
	 * Cancel record test.
	 */
	public void cancelRecordTest();

	/**
	 * Execute test.
	 * 
	 * @param testDirectory
	 *            the test directory
	 * @throws TestException
	 */
	public boolean executeTest(File testDirectory) throws TestException;

	/**
	 * Gets the or register operation type.
	 * 
	 * @param name
	 *            the name
	 * @param clazz
	 *            the clazz
	 * 
	 * @return the or register operation type
	 * @throws TestException
	 */
	public IOperationFactory getOperationFactory(String operationFactory) throws TestException;

	public TestSuite createTestSuite(File testDirectory) throws TestException;

	public void registerIfNeed(WSOperation oper) throws TestException;
}
