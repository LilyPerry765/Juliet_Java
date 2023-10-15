/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE477_Obsolete_Functions__DataInputStream_readLine_08.java
Label Definition File: CWE477_Obsolete_Functions.label.xml
Template File: point-flaw-08.tmpl.java
*/
/*
* @description
* CWE: 477 Use of Obsolete Functions
* Sinks: DataInputStream_readLine
*    GoodSink: Use of prefered java.io.BufferedReader(InputStreamReader)
*    BadSink : Use of deprecated java.io.DataInputStream.readLine() method
* Flow Variant: 08 Control flow: if(private_returns_t()) and if(private_returns_f())
*
* */

package testcases.CWE477_Obsolete_Functions;

import testcasesupport.*;

import java.net.*;
import java.text.*;
import java.util.*;
import java.io.*;
import javax.servlet.http.*;

public class CWE477_Obsolete_Functions__DataInputStream_readLine_08 extends AbstractTestCase
{

    /* The methods below always return the same value, so a tool
       should be able to figure out that every call to these
       methods will return true or return false. */
    private boolean private_returns_t()
    {
        return true;
    }

    private boolean private_returns_f()
    {
        return false;
    }

    public void bad() throws Throwable
    {
        if (private_returns_t())
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            DataInputStream dis = null;
            try
            {
                /* FLAW: Use of deprecated DataInputStream.readLine() method */
                dis = new DataInputStream(System.in);
                String cmd = dis.readLine();
            }
            catch( Exception e )
            {
                log2.warning("Error reading from console");
            }
            finally
            {
                try
                {
                    if( dis != null )
                    {
                        dis.close();
                    }
                }
                catch(IOException e)
                {
                    log2.warning("Error closing dis");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                /* FIX: Use prefered BufferedReader(InputStreamReader) constructor */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                String cmd = bufread2.readLine();
            }
            catch( Exception e )
            {
                log2.warning("Error reading from console");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }

        }
    }

    /* good1() changes private_returns_t() to private_returns_f() */
    private void good1() throws Throwable
    {
        if(private_returns_f())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            DataInputStream dis = null;
            try
            {
                /* FLAW: Use of deprecated DataInputStream.readLine() method */
                dis = new DataInputStream(System.in);
                String cmd = dis.readLine();
            }
            catch( Exception e )
            {
                log2.warning("Error reading from console");
            }
            finally
            {
                try
                {
                    if( dis != null )
                    {
                        dis.close();
                    }
                }
                catch(IOException e)
                {
                    log2.warning("Error closing dis");
                }
            }
        }
        else {

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                /* FIX: Use prefered BufferedReader(InputStreamReader) constructor */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                String cmd = bufread2.readLine();
            }
            catch( Exception e )
            {
                log2.warning("Error reading from console");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if(private_returns_t())
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                /* FIX: Use prefered BufferedReader(InputStreamReader) constructor */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                String cmd = bufread2.readLine();
            }
            catch( Exception e )
            {
                log2.warning("Error reading from console");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            DataInputStream dis = null;
            try
            {
                /* FLAW: Use of deprecated DataInputStream.readLine() method */
                dis = new DataInputStream(System.in);
                String cmd = dis.readLine();
            }
            catch( Exception e )
            {
                log2.warning("Error reading from console");
            }
            finally
            {
                try
                {
                    if( dis != null )
                    {
                        dis.close();
                    }
                }
                catch(IOException e)
                {
                    log2.warning("Error closing dis");
                }
            }

        }

    }

    public void good() throws Throwable
    {
        good1();
        good2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
