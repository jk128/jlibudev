package jlibudev.generated;
import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import jlibudev.generated.UdevLibrary.socklen_t;
/**
 * <i>native declaration : target/checkout/libudev/libudev-types.h:249</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class msghdr extends Structure {
	/**
	 * 0     8<br>
	 * C type : void*
	 */
	public Pointer msg_name;
	/**
	 * 8     4<br>
	 * C type : socklen_t
	 */
	public socklen_t msg_namelen;
	/**
	 * 16     8<br>
	 * C type : iovec*
	 */
	public jlibudev.generated.iovec.ByReference msg_iov;
	/// 24     8
	public NativeSize msg_iovlen;
	/**
	 * 32     8<br>
	 * C type : void*
	 */
	public Pointer msg_control;
	/// 40     8
	public NativeSize msg_controllen;
	/// 48     4
	public int msg_flags;
	public msghdr() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"msg_name", "msg_namelen", "msg_iov", "msg_iovlen", "msg_control", "msg_controllen", "msg_flags"});
	}
	/**
	 * @param msg_name 0     8<br>
	 * C type : void*<br>
	 * @param msg_namelen 8     4<br>
	 * C type : socklen_t<br>
	 * @param msg_iov 16     8<br>
	 * C type : iovec*<br>
	 * @param msg_iovlen 24     8<br>
	 * @param msg_control 32     8<br>
	 * C type : void*<br>
	 * @param msg_controllen 40     8<br>
	 * @param msg_flags 48     4
	 */
	public msghdr(Pointer msg_name, socklen_t msg_namelen, jlibudev.generated.iovec.ByReference msg_iov, NativeSize msg_iovlen, Pointer msg_control, NativeSize msg_controllen, int msg_flags) {
		super();
		this.msg_name = msg_name;
		this.msg_namelen = msg_namelen;
		this.msg_iov = msg_iov;
		this.msg_iovlen = msg_iovlen;
		this.msg_control = msg_control;
		this.msg_controllen = msg_controllen;
		this.msg_flags = msg_flags;
		initFieldOrder();
	}
	public static class ByReference extends msghdr implements Structure.ByReference {
		
	};
	public static class ByValue extends msghdr implements Structure.ByValue {
		
	};
}