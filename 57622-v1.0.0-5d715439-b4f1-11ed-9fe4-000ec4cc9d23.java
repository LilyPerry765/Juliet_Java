/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE690_NULL_Deref_from_Return__Properties_getProperty_equals_09.java
Label Definition File: CWE690_NULL_Deref_from_Return.label.xml
Template File: sources-sinks-09.tmpl.java
*/
/*
* @description
* CWE: 690 Unchecked return value is null, leading to a null pointer dereference.
* BadSource: Properties_getProperty Set data to return of Properties.getProperty
* GoodSource: Set data to fixed, non-null String
* Sinks: equals
*    GoodSink: Call equals() on string literal (that is not null)
*    BadSink : Call equals() on possibly null object
* Flow Variant: 09 Control flow: if(IO.static_final_t) and if(IO.static_final_f)
*
* */

package testcases.CWE690_NULL_Deref_from_Return;

import testcasesupport.*;

import java.sql.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.Properties;

public class CWE690_NULL_Deref_from_Return__Properties_getProperty_equals_09 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        String data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            FileInputStream finstrm2 = null;
            String propFileName = "./CWE690_NULL_Deref_from_Return__basic.properties";
            try
            {
                finstrm2 = new FileInputStream(propFileName);
                Properties p = new Properties();
                p.load(finstrm2);
                /* POTENTIAL FLAW: data may be set to null */
                data = p.getProperty("CWE690");
            }
            catch( IOException ioe )
            {
                IO.writeLine("Could not open properties file: " + propFileName);
                data = ""; /* ensure that data is initialized */
            }
            finally
            {
                try
                {
                    if( finstrm2 != null )
                    {
                        finstrm2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing finstrm2");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }

        }

    }

    /* goodG2B1() - use goodsource and badsink by changing first IO.static_final_t to IO.static_final_f */
    private void goodG2B1() throws Throwable
    {
        String data;
        /* INCIDENTAL: CWE 570 Statement is Always False */
        if(IO.static_final_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            FileInputStream finstrm2 = null;
            String propFileName = "./CWE690_NULL_Deref_from_Return__basic.properties";
            try
            {
                finstrm2 = new FileInputStream(propFileName);
                Properties p = new Properties();
                p.load(finstrm2);
                /* POTENTIAL FLAW: data may be set to null */
                data = p.getProperty("CWE690");
            }
            catch( IOException ioe )
            {
                IO.writeLine("Could not open properties file: " + propFileName);
                data = ""; /* ensure that data is initialized */
            }
            finally
            {
                try
                {
                    if( finstrm2 != null )
                    {
                        finstrm2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing finstrm2");
                }
            }
        }
        else {

            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }

        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    private void goodG2B2() throws Throwable
    {
        String data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            FileInputStream finstrm2 = null;
            String propFileName = "./CWE690_NULL_Deref_from_Return__basic.properties";
            try
            {
                finstrm2 = new FileInputStream(propFileName);
                Properties p = new Properties();
                p.load(finstrm2);

                /* POTENTIAL FLAW: data may be set to null */
                data = p.getProperty("CWE690");
            }
            catch( IOException ioe )
            {
                IO.writeLine("Could not open properties file: " + propFileName);
                data = ""; /* ensure that data is initialized */
            }
            finally
            {
                try
                {
                    if( finstrm2 != null )
                    {
                        finstrm2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing finstrm2");
                }
            }

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }

        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second IO.static_final_t to IO.static_final_f */
    private void goodB2G1() throws Throwable
    {
        String data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            FileInputStream finstrm2 = null;
            String propFileName = "./CWE690_NULL_Deref_from_Return__basic.properties";
            try
            {
                finstrm2 = new FileInputStream(propFileName);
                Properties p = new Properties();
                p.load(finstrm2);
                /* POTENTIAL FLAW: data may be set to null */
                data = p.getProperty("CWE690");
            }
            catch( IOException ioe )
            {
                IO.writeLine("Could not open properties file: " + propFileName);
                data = ""; /* ensure that data is initialized */
            }
            finally
            {
                try
                {
                    if( finstrm2 != null )
                    {
                        finstrm2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing finstrm2");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";

        }
        /* INCIDENTAL: CWE 570 Statement is Always False */
        if(IO.static_final_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
        }
        else {

            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    private void goodB2G2() throws Throwable
    {
        String data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            FileInputStream finstrm2 = null;
            String propFileName = "./CWE690_NULL_Deref_from_Return__basic.properties";
            try
            {
                finstrm2 = new FileInputStream(propFileName);
                Properties p = new Properties();
                p.load(finstrm2);
                /* POTENTIAL FLAW: data may be set to null */
                data = p.getProperty("CWE690");
            }
            catch( IOException ioe )
            {
                IO.writeLine("Could not open properties file: " + propFileName);
                data = ""; /* ensure that data is initialized */
            }
            finally
            {
                try
                {
                    if( finstrm2 != null )
                    {
                        finstrm2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing finstrm2");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            /* FIX: call equals() on string literal (that is not null) */
            if("CWE690".equals(data))
            {
                IO.writeLine("data is CWE690");
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }

        }
    }

    public void good() throws Throwable
    {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
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
