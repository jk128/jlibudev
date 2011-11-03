package jlibudev.generated;
import com.sun.jna.Structure;
/**
 * <i>native declaration : target/checkout/libudev/libudev-types.h:63</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class udev_list_node extends Structure {
	/**
	 * 0     8<br>
	 * C type : udev_list_node*
	 */
	public udev_list_node.ByReference next;
	/**
	 * 8     8<br>
	 * C type : udev_list_node*
	 */
	public udev_list_node.ByReference prev;
	public udev_list_node() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"next", "prev"});
	}
	/**
	 * @param next 0     8<br>
	 * C type : udev_list_node*<br>
	 * @param prev 8     8<br>
	 * C type : udev_list_node*
	 */
	public udev_list_node(udev_list_node.ByReference next, udev_list_node.ByReference prev) {
		super();
		this.next = next;
		this.prev = prev;
		initFieldOrder();
	}
	public static class ByReference extends udev_list_node implements Structure.ByReference {
		
	};
	public static class ByValue extends udev_list_node implements Structure.ByValue {
		
	};
}