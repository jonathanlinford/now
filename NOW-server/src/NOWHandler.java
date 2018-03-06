import java.io.*;

public class NOWHandler {

    /**
     * This method is used to read a stream coming from a connection and output that stream in the form of a string.
     * @param is    The input stream from a connection.
     * @return      The contents of the stream, in the form of the String.
     * @throws IOException  If there is a problem with the input and output, IOException is thrown.
     */
    public static String readString(InputStream is) throws IOException{
        StringBuilder sb = new StringBuilder();
        InputStreamReader sr = new InputStreamReader(is);

        char[] buf = new char[1024];
        int len;

        while ((len = sr.read(buf)) > 0){
            sb.append(buf, 0, len);
        }
        return sb.toString();
    }

    /**
     * This method is used to read a string to a stream stream used by the connection.
     * @param str           The string to be written to the stream.
     * @param os            The stream used by the connection
     * @throws IOException  If there is a problem with the input and output, IOException is thrown.
     */
    public static void writeString(String str, OutputStream os) throws IOException{
        OutputStreamWriter sw = new OutputStreamWriter(os);
        sw.write(str);
        sw.flush();
    }
}
