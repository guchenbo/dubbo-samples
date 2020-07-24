package org.apache.dubbo.samples.provider;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

public class App {

  public static void main(String[] args) {
    Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();

    Invoker invoker = new Invoker() {
      @Override
      public Class getInterface() {
        return null;
      }

      @Override
      public Result invoke(Invocation invocation) throws RpcException {
        return null;
      }

      @Override
      public URL getUrl() {
        return null;
      }

      @Override
      public boolean isAvailable() {
        return false;
      }

      @Override
      public void destroy() {

      }
    };
    protocol.export(invoker);
    System.out.println(protocol);
  }

}
