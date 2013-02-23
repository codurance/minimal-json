/*******************************************************************************
 * Copyright (c) 2013 EclipseSource.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralf Sternberg - initial implementation and API
 ******************************************************************************/
package com.eclipsesource.json.test.mocking;

import org.junit.Test;
import org.mockito.Mockito;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;


/**
 * Make sure types do not prevent mocking by final or visibility constructs.
 */
public class Mocking_Test {

  @Test
  public void mockObject() {
    Mockito.mock( JsonObject.class );
  }

  @Test
  public void mockArray() {
    Mockito.mock( JsonArray.class );
  }

  @Test
  public void mockValue() {
    Mockito.mock( JsonValue.class );
  }

}
