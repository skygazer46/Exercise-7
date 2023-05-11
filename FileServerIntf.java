import java.io.*;

import java.rmi.*;

public interface FileServerIntf extends Remote

{

public void FileCopy(String d1,String d2)throws

RemoteException,IOException;

}
