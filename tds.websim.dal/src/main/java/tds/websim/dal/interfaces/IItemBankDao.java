/*******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *     
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * https://bitbucket.org/sbacoss/eotds/wiki/AIR_Open_Source_License
 ******************************************************************************/
package tds.websim.dal.interfaces;

import TDS.Shared.Data.ReturnStatus;
import TDS.Shared.Exceptions.ReturnStatusException;

public interface IItemBankDao
{
  public abstract ReturnStatus loaderMain (String testKey, String xmlTestPackage) throws ReturnStatusException;
}
