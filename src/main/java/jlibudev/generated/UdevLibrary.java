package jlibudev.generated;
import java.nio.ByteBuffer;

import pl.dragodev.jna.NativeSize;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
/**
 * JNA Wrapper for library <b>udev</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface UdevLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "udev";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(UdevLibrary.JNA_LIBRARY_NAME);
	public static final UdevLibrary INSTANCE = (UdevLibrary)Native.loadLibrary(UdevLibrary.JNA_LIBRARY_NAME, UdevLibrary.class);
	/// <i>native declaration : target/checkout/libudev/libudev.h:33</i>
	/// <i>native declaration : target/checkout/libudev/libudev.h:33</i>
	public interface udev_set_log_fn_log_fn_callback extends Callback {
		void apply(UdevLibrary.udev udev, int priority, Pointer file, int line, Pointer fn, Pointer format, UdevLibrary.va_list args);
	};
	/**
	 * Original signature : <code>udev* udev_ref(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:29</i>
	 */
	UdevLibrary.udev udev_ref(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>void udev_unref(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:30</i>
	 */
	void udev_unref(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>udev* udev_new()</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:31</i>
	 */
	UdevLibrary.udev udev_new();
	/**
	 * Original signature : <code>void udev_set_log_fn(udev*, udev_set_log_fn_log_fn_callback)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:32</i>
	 */
	void udev_set_log_fn(UdevLibrary.udev udev, UdevLibrary.udev_set_log_fn_log_fn_callback arg);
	/**
	 * Original signature : <code>int udev_get_log_priority(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:36</i>
	 */
	int udev_get_log_priority(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>void udev_set_log_priority(udev*, int)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:37</i>
	 */
	void udev_set_log_priority(UdevLibrary.udev udev, int priority);
	/**
	 * Original signature : <code>char* udev_get_sys_path(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:38</i>
	 */
	String udev_get_sys_path(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>char* udev_get_dev_path(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:39</i>
	 */
	String udev_get_dev_path(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>char* udev_get_run_path(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:40</i>
	 */
	String udev_get_run_path(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>void* udev_get_userdata(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:41</i>
	 */
	Pointer udev_get_userdata(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>void udev_set_userdata(udev*, void*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:42</i>
	 */
	void udev_set_userdata(UdevLibrary.udev udev, Pointer userdata);
	/**
	 * Original signature : <code>udev_list_entry* udev_list_entry_get_next(udev_list_entry*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:50</i>
	 */
	UdevLibrary.udev_list_entry udev_list_entry_get_next(UdevLibrary.udev_list_entry list_entry);
	/**
	 * Original signature : <code>udev_list_entry* udev_list_entry_get_by_name(udev_list_entry*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:51</i><br>
	 * @deprecated use the safer methods {@link #udev_list_entry_get_by_name(jlibudev.generated.UdevLibrary.udev_list_entry, java.lang.String)} and {@link #udev_list_entry_get_by_name(jlibudev.generated.UdevLibrary.udev_list_entry, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	UdevLibrary.udev_list_entry udev_list_entry_get_by_name(UdevLibrary.udev_list_entry list_entry, Pointer name);
	/**
	 * Original signature : <code>udev_list_entry* udev_list_entry_get_by_name(udev_list_entry*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:51</i>
	 */
	UdevLibrary.udev_list_entry udev_list_entry_get_by_name(UdevLibrary.udev_list_entry list_entry, String name);
	/**
	 * Original signature : <code>char* udev_list_entry_get_name(udev_list_entry*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:52</i>
	 */
	String udev_list_entry_get_name(UdevLibrary.udev_list_entry list_entry);
	/**
	 * Original signature : <code>char* udev_list_entry_get_value(udev_list_entry*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:53</i>
	 */
	String udev_list_entry_get_value(UdevLibrary.udev_list_entry list_entry);
	/**
	 * Original signature : <code>udev_device* udev_device_ref(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:72</i>
	 */
	UdevLibrary.udev_device udev_device_ref(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>void udev_device_unref(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:73</i>
	 */
	void udev_device_unref(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>udev* udev_device_get_udev(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:74</i>
	 */
	UdevLibrary.udev udev_device_get_udev(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_syspath(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:75</i><br>
	 * @deprecated use the safer methods {@link #udev_device_new_from_syspath(jlibudev.generated.UdevLibrary.udev, java.lang.String)} and {@link #udev_device_new_from_syspath(jlibudev.generated.UdevLibrary.udev, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	UdevLibrary.udev_device udev_device_new_from_syspath(UdevLibrary.udev udev, Pointer syspath);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_syspath(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:75</i>
	 */
	UdevLibrary.udev_device udev_device_new_from_syspath(UdevLibrary.udev udev, String syspath);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_devnum(udev*, char, dev_t)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:76</i>
	 */
	UdevLibrary.udev_device udev_device_new_from_devnum(UdevLibrary.udev udev, byte type, NativeLong devnum);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_subsystem_sysname(udev*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:77</i><br>
	 * @deprecated use the safer methods {@link #udev_device_new_from_subsystem_sysname(jlibudev.generated.UdevLibrary.udev, java.lang.String, java.lang.String)} and {@link #udev_device_new_from_subsystem_sysname(jlibudev.generated.UdevLibrary.udev, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	UdevLibrary.udev_device udev_device_new_from_subsystem_sysname(UdevLibrary.udev udev, Pointer subsystem, Pointer sysname);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_subsystem_sysname(udev*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:77</i>
	 */
	UdevLibrary.udev_device udev_device_new_from_subsystem_sysname(UdevLibrary.udev udev, String subsystem, String sysname);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_environment(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:78</i>
	 */
	UdevLibrary.udev_device udev_device_new_from_environment(UdevLibrary.udev udev);
	/**
	 * udev_device_get_parent_*() does not take a reference on the returned device, it is automatically unref'd with the parent<br>
	 * Original signature : <code>udev_device* udev_device_get_parent(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:80</i>
	 */
	UdevLibrary.udev_device udev_device_get_parent(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>udev_device* udev_device_get_parent_with_subsystem_devtype(udev_device*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:81</i><br>
	 * @deprecated use the safer methods {@link #udev_device_get_parent_with_subsystem_devtype(jlibudev.generated.UdevLibrary.udev_device, java.lang.String, java.lang.String)} and {@link #udev_device_get_parent_with_subsystem_devtype(jlibudev.generated.UdevLibrary.udev_device, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	UdevLibrary.udev_device udev_device_get_parent_with_subsystem_devtype(UdevLibrary.udev_device udev_device, Pointer subsystem, Pointer devtype);
	/**
	 * Original signature : <code>udev_device* udev_device_get_parent_with_subsystem_devtype(udev_device*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:81</i>
	 */
	UdevLibrary.udev_device udev_device_get_parent_with_subsystem_devtype(UdevLibrary.udev_device udev_device, String subsystem, String devtype);
	/**
	 * retrieve device properties<br>
	 * Original signature : <code>char* udev_device_get_devpath(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:84</i>
	 */
	String udev_device_get_devpath(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_subsystem(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:85</i>
	 */
	String udev_device_get_subsystem(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_devtype(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:86</i>
	 */
	String udev_device_get_devtype(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_syspath(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:87</i>
	 */
	String udev_device_get_syspath(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_sysname(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:88</i>
	 */
	String udev_device_get_sysname(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_sysnum(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:89</i>
	 */
	String udev_device_get_sysnum(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_devnode(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:90</i>
	 */
	String udev_device_get_devnode(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>int udev_device_get_is_initialized(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:91</i>
	 */
	int udev_device_get_is_initialized(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>udev_list_entry* udev_device_get_devlinks_list_entry(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:92</i>
	 */
	UdevLibrary.udev_list_entry udev_device_get_devlinks_list_entry(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>udev_list_entry* udev_device_get_properties_list_entry(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:93</i>
	 */
	UdevLibrary.udev_list_entry udev_device_get_properties_list_entry(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>udev_list_entry* udev_device_get_tags_list_entry(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:94</i>
	 */
	UdevLibrary.udev_list_entry udev_device_get_tags_list_entry(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>udev_list_entry* udev_device_get_sysattr_list_entry(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:95</i>
	 */
	UdevLibrary.udev_list_entry udev_device_get_sysattr_list_entry(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_property_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:96</i><br>
	 * @deprecated use the safer methods {@link #udev_device_get_property_value(jlibudev.generated.UdevLibrary.udev_device, java.lang.String)} and {@link #udev_device_get_property_value(jlibudev.generated.UdevLibrary.udev_device, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	String udev_device_get_property_value(UdevLibrary.udev_device udev_device, Pointer key);
	/**
	 * Original signature : <code>char* udev_device_get_property_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:96</i>
	 */
	String udev_device_get_property_value(UdevLibrary.udev_device udev_device, String key);
	/**
	 * Original signature : <code>char* udev_device_get_driver(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:97</i>
	 */
	String udev_device_get_driver(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>dev_t udev_device_get_devnum(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:98</i>
	 */
	NativeLong udev_device_get_devnum(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_action(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:99</i>
	 */
	String udev_device_get_action(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>int udev_device_get_seqnum(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:100</i>
	 */
	long udev_device_get_seqnum(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>int udev_device_get_usec_since_initialized(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:101</i>
	 */
	long udev_device_get_usec_since_initialized(UdevLibrary.udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_sysattr_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:102</i><br>
	 * @deprecated use the safer methods {@link #udev_device_get_sysattr_value(jlibudev.generated.UdevLibrary.udev_device, java.lang.String)} and {@link #udev_device_get_sysattr_value(jlibudev.generated.UdevLibrary.udev_device, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	String udev_device_get_sysattr_value(UdevLibrary.udev_device udev_device, Pointer sysattr);
	/**
	 * Original signature : <code>char* udev_device_get_sysattr_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:102</i>
	 */
	String udev_device_get_sysattr_value(UdevLibrary.udev_device udev_device, String sysattr);
	/**
	 * Original signature : <code>int udev_device_has_tag(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:103</i><br>
	 * @deprecated use the safer methods {@link #udev_device_has_tag(jlibudev.generated.UdevLibrary.udev_device, java.lang.String)} and {@link #udev_device_has_tag(jlibudev.generated.UdevLibrary.udev_device, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_device_has_tag(UdevLibrary.udev_device udev_device, Pointer tag);
	/**
	 * Original signature : <code>int udev_device_has_tag(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:103</i>
	 */
	int udev_device_has_tag(UdevLibrary.udev_device udev_device, String tag);
	/**
	 * Original signature : <code>udev_monitor* udev_monitor_ref(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:111</i>
	 */
	UdevLibrary.udev_monitor udev_monitor_ref(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * Original signature : <code>void udev_monitor_unref(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:112</i>
	 */
	void udev_monitor_unref(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * Original signature : <code>udev* udev_monitor_get_udev(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:113</i>
	 */
	UdevLibrary.udev udev_monitor_get_udev(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * kernel and udev generated events over netlink<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_netlink(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:115</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_new_from_netlink(jlibudev.generated.UdevLibrary.udev, java.lang.String)} and {@link #udev_monitor_new_from_netlink(jlibudev.generated.UdevLibrary.udev, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	UdevLibrary.udev_monitor udev_monitor_new_from_netlink(UdevLibrary.udev udev, Pointer name);
	/**
	 * kernel and udev generated events over netlink<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_netlink(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:115</i>
	 */
	UdevLibrary.udev_monitor udev_monitor_new_from_netlink(UdevLibrary.udev udev, String name);
	/**
	 * custom socket (use netlink and filters instead)<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_socket(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:117</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_new_from_socket(jlibudev.generated.UdevLibrary.udev, java.lang.String)} and {@link #udev_monitor_new_from_socket(jlibudev.generated.UdevLibrary.udev, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	UdevLibrary.udev_monitor udev_monitor_new_from_socket(UdevLibrary.udev udev, Pointer socket_path);
	/**
	 * custom socket (use netlink and filters instead)<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_socket(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:117</i>
	 */
	UdevLibrary.udev_monitor udev_monitor_new_from_socket(UdevLibrary.udev udev, String socket_path);
	/**
	 * bind socket<br>
	 * Original signature : <code>int udev_monitor_enable_receiving(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:119</i>
	 */
	int udev_monitor_enable_receiving(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * Original signature : <code>int udev_monitor_set_receive_buffer_size(udev_monitor*, int)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:120</i>
	 */
	int udev_monitor_set_receive_buffer_size(UdevLibrary.udev_monitor udev_monitor, int size);
	/**
	 * Original signature : <code>int udev_monitor_get_fd(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:121</i>
	 */
	int udev_monitor_get_fd(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * Original signature : <code>udev_device* udev_monitor_receive_device(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:122</i>
	 */
	UdevLibrary.udev_device udev_monitor_receive_device(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * in-kernel socket filters to select messages that get delivered to a listener<br>
	 * Original signature : <code>int udev_monitor_filter_add_match_subsystem_devtype(udev_monitor*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:124</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_filter_add_match_subsystem_devtype(jlibudev.generated.UdevLibrary.udev_monitor, java.lang.String, java.lang.String)} and {@link #udev_monitor_filter_add_match_subsystem_devtype(jlibudev.generated.UdevLibrary.udev_monitor, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_monitor_filter_add_match_subsystem_devtype(UdevLibrary.udev_monitor udev_monitor, Pointer subsystem, Pointer devtype);
	/**
	 * in-kernel socket filters to select messages that get delivered to a listener<br>
	 * Original signature : <code>int udev_monitor_filter_add_match_subsystem_devtype(udev_monitor*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:124</i>
	 */
	int udev_monitor_filter_add_match_subsystem_devtype(UdevLibrary.udev_monitor udev_monitor, String subsystem, String devtype);
	/**
	 * Original signature : <code>int udev_monitor_filter_add_match_tag(udev_monitor*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:126</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_filter_add_match_tag(jlibudev.generated.UdevLibrary.udev_monitor, java.lang.String)} and {@link #udev_monitor_filter_add_match_tag(jlibudev.generated.UdevLibrary.udev_monitor, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_monitor_filter_add_match_tag(UdevLibrary.udev_monitor udev_monitor, Pointer tag);
	/**
	 * Original signature : <code>int udev_monitor_filter_add_match_tag(udev_monitor*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:126</i>
	 */
	int udev_monitor_filter_add_match_tag(UdevLibrary.udev_monitor udev_monitor, String tag);
	/**
	 * Original signature : <code>int udev_monitor_filter_update(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:127</i>
	 */
	int udev_monitor_filter_update(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * Original signature : <code>int udev_monitor_filter_remove(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:128</i>
	 */
	int udev_monitor_filter_remove(UdevLibrary.udev_monitor udev_monitor);
	/**
	 * Original signature : <code>udev_enumerate* udev_enumerate_ref(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:136</i>
	 */
	UdevLibrary.udev_enumerate udev_enumerate_ref(UdevLibrary.udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>void udev_enumerate_unref(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:137</i>
	 */
	void udev_enumerate_unref(UdevLibrary.udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>udev* udev_enumerate_get_udev(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:138</i>
	 */
	UdevLibrary.udev udev_enumerate_get_udev(UdevLibrary.udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>udev_enumerate* udev_enumerate_new(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:139</i>
	 */
	UdevLibrary.udev_enumerate udev_enumerate_new(UdevLibrary.udev udev);
	/**
	 * device properties filter<br>
	 * Original signature : <code>int udev_enumerate_add_match_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:141</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_subsystem(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_match_subsystem(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_subsystem(UdevLibrary.udev_enumerate udev_enumerate, Pointer subsystem);
	/**
	 * device properties filter<br>
	 * Original signature : <code>int udev_enumerate_add_match_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:141</i>
	 */
	int udev_enumerate_add_match_subsystem(UdevLibrary.udev_enumerate udev_enumerate, String subsystem);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:142</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_nomatch_subsystem(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_nomatch_subsystem(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_nomatch_subsystem(UdevLibrary.udev_enumerate udev_enumerate, Pointer subsystem);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:142</i>
	 */
	int udev_enumerate_add_nomatch_subsystem(UdevLibrary.udev_enumerate udev_enumerate, String subsystem);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:143</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_sysattr(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String, java.lang.String)} and {@link #udev_enumerate_add_match_sysattr(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_sysattr(UdevLibrary.udev_enumerate udev_enumerate, Pointer sysattr, Pointer value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:143</i>
	 */
	int udev_enumerate_add_match_sysattr(UdevLibrary.udev_enumerate udev_enumerate, String sysattr, String value);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:144</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_nomatch_sysattr(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String, java.lang.String)} and {@link #udev_enumerate_add_nomatch_sysattr(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_nomatch_sysattr(UdevLibrary.udev_enumerate udev_enumerate, Pointer sysattr, Pointer value);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:144</i>
	 */
	int udev_enumerate_add_nomatch_sysattr(UdevLibrary.udev_enumerate udev_enumerate, String sysattr, String value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_property(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:145</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_property(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String, java.lang.String)} and {@link #udev_enumerate_add_match_property(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_property(UdevLibrary.udev_enumerate udev_enumerate, Pointer property, Pointer value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_property(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:145</i>
	 */
	int udev_enumerate_add_match_property(UdevLibrary.udev_enumerate udev_enumerate, String property, String value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysname(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:146</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_sysname(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_match_sysname(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_sysname(UdevLibrary.udev_enumerate udev_enumerate, Pointer sysname);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysname(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:146</i>
	 */
	int udev_enumerate_add_match_sysname(UdevLibrary.udev_enumerate udev_enumerate, String sysname);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_tag(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:147</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_tag(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_match_tag(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_tag(UdevLibrary.udev_enumerate udev_enumerate, Pointer tag);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_tag(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:147</i>
	 */
	int udev_enumerate_add_match_tag(UdevLibrary.udev_enumerate udev_enumerate, String tag);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_parent(udev_enumerate*, udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:148</i>
	 */
	int udev_enumerate_add_match_parent(UdevLibrary.udev_enumerate udev_enumerate, UdevLibrary.udev_device parent);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_is_initialized(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:149</i>
	 */
	int udev_enumerate_add_match_is_initialized(UdevLibrary.udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>int udev_enumerate_add_syspath(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:150</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_syspath(jlibudev.generated.UdevLibrary.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_syspath(jlibudev.generated.UdevLibrary.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_syspath(UdevLibrary.udev_enumerate udev_enumerate, Pointer syspath);
	/**
	 * Original signature : <code>int udev_enumerate_add_syspath(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:150</i>
	 */
	int udev_enumerate_add_syspath(UdevLibrary.udev_enumerate udev_enumerate, String syspath);
	/**
	 * run enumeration with active filters<br>
	 * Original signature : <code>int udev_enumerate_scan_devices(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:152</i>
	 */
	int udev_enumerate_scan_devices(UdevLibrary.udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>int udev_enumerate_scan_subsystems(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:153</i>
	 */
	int udev_enumerate_scan_subsystems(UdevLibrary.udev_enumerate udev_enumerate);
	/**
	 * return device list<br>
	 * Original signature : <code>udev_list_entry* udev_enumerate_get_list_entry(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:155</i>
	 */
	UdevLibrary.udev_list_entry udev_enumerate_get_list_entry(UdevLibrary.udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>udev_queue* udev_queue_ref(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:163</i>
	 */
	UdevLibrary.udev_queue udev_queue_ref(UdevLibrary.udev_queue udev_queue);
	/**
	 * Original signature : <code>void udev_queue_unref(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:164</i>
	 */
	void udev_queue_unref(UdevLibrary.udev_queue udev_queue);
	/**
	 * Original signature : <code>udev* udev_queue_get_udev(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:165</i>
	 */
	UdevLibrary.udev udev_queue_get_udev(UdevLibrary.udev_queue udev_queue);
	/**
	 * Original signature : <code>udev_queue* udev_queue_new(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:166</i>
	 */
	UdevLibrary.udev_queue udev_queue_new(UdevLibrary.udev udev);
	/**
	 * Original signature : <code>int udev_queue_get_kernel_seqnum(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:167</i>
	 */
	long udev_queue_get_kernel_seqnum(UdevLibrary.udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_udev_seqnum(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:168</i>
	 */
	long udev_queue_get_udev_seqnum(UdevLibrary.udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_udev_is_active(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:169</i>
	 */
	int udev_queue_get_udev_is_active(UdevLibrary.udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_queue_is_empty(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:170</i>
	 */
	int udev_queue_get_queue_is_empty(UdevLibrary.udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_seqnum_is_finished(udev_queue*, unsigned long long)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:171</i>
	 */
	int udev_queue_get_seqnum_is_finished(UdevLibrary.udev_queue udev_queue, NativeLong seqnum);
	/**
	 * Original signature : <code>int udev_queue_get_seqnum_sequence_is_finished(udev_queue*, unsigned long long, unsigned long long)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:172</i>
	 */
	int udev_queue_get_seqnum_sequence_is_finished(UdevLibrary.udev_queue udev_queue, NativeLong start, NativeLong end);
	/**
	 * Original signature : <code>udev_list_entry* udev_queue_get_queued_list_entry(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:174</i>
	 */
	UdevLibrary.udev_list_entry udev_queue_get_queued_list_entry(UdevLibrary.udev_queue udev_queue);
	/**
	 * udev_util<br>
	 * * udev specific utilities<br>
	 * Original signature : <code>int udev_util_encode_string(const char*, char*, size_t)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:181</i><br>
	 * @deprecated use the safer methods {@link #udev_util_encode_string(java.lang.String, java.nio.ByteBuffer, com.ochafik.lang.jnaerator.runtime.NativeSize)} and {@link #udev_util_encode_string(com.sun.jna.Pointer, com.sun.jna.Pointer, com.ochafik.lang.jnaerator.runtime.NativeSize)} instead
	 */
	@Deprecated 
	int udev_util_encode_string(Pointer str, Pointer str_enc, NativeSize len);
	/**
	 * udev_util<br>
	 * * udev specific utilities<br>
	 * Original signature : <code>int udev_util_encode_string(const char*, char*, size_t)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:181</i>
	 */
	int udev_util_encode_string(String str, ByteBuffer str_enc, NativeSize len);
	public static class udev_queue extends PointerType {
		public udev_queue(Pointer address) {
			super(address);
		}
		public udev_queue() {
			super();
		}
	};
	public static class udev_device extends PointerType {
		public udev_device(Pointer address) {
			super(address);
		}
		public udev_device() {
			super();
		}
	};
	public static class udev_list_entry extends PointerType {
		public udev_list_entry(Pointer address) {
			super(address);
		}
		public udev_list_entry() {
			super();
		}
	};
	public static class va_list extends PointerType {
		public va_list(Pointer address) {
			super(address);
		}
		public va_list() {
			super();
		}
	};
	public static class udev extends PointerType {
		public udev(Pointer address) {
			super(address);
		}
		public udev() {
			super();
		}
	};
	public static class udev_monitor extends PointerType {
		public udev_monitor(Pointer address) {
			super(address);
		}
		public udev_monitor() {
			super();
		}
	};
	public static class udev_enumerate extends PointerType {
		public udev_enumerate(Pointer address) {
			super(address);
		}
		public udev_enumerate() {
			super();
		}
	};
}
