/*
 * Copyright 2009-2015 DigitalGlobe, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package org.mrgeo.hdfs.vector.shp.util.jdbc;

public class JDBCSource implements java.io.Serializable
{
  private static final long serialVersionUID = 1L;
  public String driver; // JDBC driver class name
  public transient int freeConn = 0; // current number of connections free in
                                     // pool
  public transient int inuseConn = 0; // current number of connections estimated
                                      // in use
  public transient int maxConn = 0; // maximum number of connections (specified)
  public String name; // pool identifier
  protected String password; // user name's password
  public String url; // JDBC database URL
  public String user; // user name for the pool

  public String getDriver()
  {
    return driver;
  }

  public String getName()
  {
    return name;
  }

  public String getUrl()
  {
    return url;
  }

  public String getUser()
  {
    return user;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  @Override
  public String toString()
  {
    return name + " " + driver + " " + url + " (" + inuseConn + "+" + freeConn + "=" + maxConn
        + ")";
  }
}