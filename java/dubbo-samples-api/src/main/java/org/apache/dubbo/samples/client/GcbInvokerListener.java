package org.apache.dubbo.samples.client;

import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.InvokerListener;
import org.apache.dubbo.rpc.RpcException;

public class GcbInvokerListener implements InvokerListener {

  @Override
  public void referred(Invoker<?> invoker) throws RpcException {
    System.out.println(invoker.getUrl() + " refered");
  }

  @Override
  public void destroyed(Invoker<?> invoker) {

  }
}
