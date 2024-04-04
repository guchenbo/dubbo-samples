package org.apache.dubbo.samples.provider;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

public class App {

  public static void main(String[] args) {
    ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
    Protocol protocol = extensionLoader.getExtension("dubbo");
    System.out.println(protocol);

    Protocol protocol1 = extensionLoader.getAdaptiveExtension();
    System.out.println(protocol1);
  }
}
