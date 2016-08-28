/**
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * <p>
 * http://ec.europa.eu/idabc/eupl
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * <p>
 * Date: 23-08-2016
 * Author(s): Sjoerd Boerhout
 * <p>
 */
package nl.dictu.prova.plugins.input.msexcel.readers.testdata;

import java.io.File;
import java.util.LinkedList;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Sjoerd Boerhout
 */
public abstract class TestDataReader
{

  private static Logger LOGGER = LogManager.getLogger(
          TestDataReader.class.getName());


  /**
   * Set the logger to the logger of the implementing class
   *
   * @param newLogger
   *
   * @throws NullPointerException
   */
  protected TestDataReader(Logger newLogger) throws NullPointerException
  {

    if(newLogger == null)
    {
      throw new NullPointerException("Logger instance is null");
    }

    LOGGER = newLogger;
  }


  /**
   * Retrieves all the dataset names from the given file
   *
   * @param dataSetFile
   *
   * @return
   * @throws java.lang.Exception
   */
  public abstract LinkedList<String> getDataSetNames(File dataSetFile)
          throws Exception;


  /**
   * Retrieve all the variables and the values from the given test data set.
   *
   * @param dataSetFile
   * @param dataSetName
   *
   * @return
   *
   * @throws Exception
   */
  public abstract Properties getVariables(File dataSetFile,
                                          String dataSetName) throws
          Exception;
}
