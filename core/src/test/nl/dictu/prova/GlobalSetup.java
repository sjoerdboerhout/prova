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
 * Date:      28-08-2016
 * Author(s): Sjoerd Boerhout
 * <p>
 */
package nl.dictu.prova;

import nl.dictu.prova.logging.LogLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

/**
 * Configuration for all unit tests
 *
 * @author Sjoerd Boerhout
 */
public class GlobalSetup
{
  public static void configure()
  {
    configureLog4j();
  }


  /**
   * Configure jUnit to display logging while running the unit tests.
   * Available options: Fatal, Error, Warning, Info, Debug and Trace.
   */
  private static void configureLog4j()
  {
    System.setProperty("prova.log.level", LogLevel.DEBUG.name());
    LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
    ctx.reconfigure();
  }
}
