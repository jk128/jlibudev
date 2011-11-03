package jlibudev.generated;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
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
	/// <i>native declaration : target/checkout/libudev/libudev.h:0</i>
	public interface udev_set_log_fn_arg1_log_fn_callback extends Callback {
		void apply(udev udev, int priority, Pointer file, int line, Pointer fn, Pointer format, UdevLibrary.va_list args);
	};
	/**
	 * Original signature : <code>udev* udev_ref(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:29</i>
	 */
	udev udev_ref(udev udev);
	/**
	 * Original signature : <code>void udev_unref(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:30</i>
	 */
	void udev_unref(udev udev);
	/**
	 * Original signature : <code>udev* udev_new()</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:31</i>
	 */
	udev udev_new();
	/**
	 * Original signature : <code>void udev_set_log_fn(udev*, udev_set_log_fn_arg1_log_fn_callback)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:32</i>
	 */
	void udev_set_log_fn(udev udev, UdevLibrary.udev_set_log_fn_arg1_log_fn_callback arg1);
	/**
	 * Original signature : <code>int udev_get_log_priority(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:36</i>
	 */
	int udev_get_log_priority(udev udev);
	/**
	 * Original signature : <code>void udev_set_log_priority(udev*, int)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:37</i>
	 */
	void udev_set_log_priority(udev udev, int priority);
	/**
	 * Original signature : <code>char* udev_get_sys_path(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:38</i>
	 */
	String udev_get_sys_path(udev udev);
	/**
	 * Original signature : <code>char* udev_get_dev_path(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:39</i>
	 */
	String udev_get_dev_path(udev udev);
	/**
	 * Original signature : <code>void* udev_get_userdata(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:40</i>
	 */
	Pointer udev_get_userdata(udev udev);
	/**
	 * Original signature : <code>void udev_set_userdata(udev*, void*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:41</i>
	 */
	void udev_set_userdata(udev udev, Pointer userdata);
	/**
	 * Original signature : <code>udev_list_entry* udev_list_entry_get_next(udev_list_entry*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:49</i>
	 */
	udev_list_entry udev_list_entry_get_next(udev_list_entry list_entry);
	/**
	 * Original signature : <code>udev_list_entry* udev_list_entry_get_by_name(udev_list_entry*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:50</i><br>
	 * @deprecated use the safer methods {@link #udev_list_entry_get_by_name(jlibudev.generated.udev_list_entry, java.lang.String)} and {@link #udev_list_entry_get_by_name(jlibudev.generated.udev_list_entry, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	udev_list_entry udev_list_entry_get_by_name(udev_list_entry list_entry, Pointer name);
	/**
	 * Original signature : <code>udev_list_entry* udev_list_entry_get_by_name(udev_list_entry*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:50</i>
	 */
	udev_list_entry udev_list_entry_get_by_name(udev_list_entry list_entry, String name);
	/**
	 * Original signature : <code>char* udev_list_entry_get_name(udev_list_entry*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:51</i>
	 */
	String udev_list_entry_get_name(udev_list_entry list_entry);
	/**
	 * Original signature : <code>char* udev_list_entry_get_value(udev_list_entry*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:52</i>
	 */
	String udev_list_entry_get_value(udev_list_entry list_entry);
	/**
	 * Original signature : <code>udev_device* udev_device_ref(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:71</i>
	 */
	udev_device udev_device_ref(udev_device udev_device);
	/**
	 * Original signature : <code>void udev_device_unref(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:72</i>
	 */
	void udev_device_unref(udev_device udev_device);
	/**
	 * Original signature : <code>udev* udev_device_get_udev(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:73</i>
	 */
	udev udev_device_get_udev(udev_device udev_device);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_syspath(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:74</i><br>
	 * @deprecated use the safer methods {@link #udev_device_new_from_syspath(jlibudev.generated.udev, java.lang.String)} and {@link #udev_device_new_from_syspath(jlibudev.generated.udev, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	udev_device udev_device_new_from_syspath(udev udev, Pointer syspath);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_syspath(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:74</i>
	 */
	udev_device udev_device_new_from_syspath(udev udev, String syspath);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_devnum(udev*, char, dev_t)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:75</i>
	 */
	udev_device udev_device_new_from_devnum(udev udev, byte type, int devnum);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_subsystem_sysname(udev*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:76</i><br>
	 * @deprecated use the safer methods {@link #udev_device_new_from_subsystem_sysname(jlibudev.generated.udev, java.lang.String, java.lang.String)} and {@link #udev_device_new_from_subsystem_sysname(jlibudev.generated.udev, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	udev_device udev_device_new_from_subsystem_sysname(udev udev, Pointer subsystem, Pointer sysname);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_subsystem_sysname(udev*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:76</i>
	 */
	udev_device udev_device_new_from_subsystem_sysname(udev udev, String subsystem, String sysname);
	/**
	 * Original signature : <code>udev_device* udev_device_new_from_environment(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:77</i>
	 */
	udev_device udev_device_new_from_environment(udev udev);
	/**
	 * udev_device_get_parent_*() does not take a reference on the returned device, it is automatically unref'd with the parent<br>
	 * Original signature : <code>udev_device* udev_device_get_parent(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:79</i>
	 */
	udev_device udev_device_get_parent(udev_device udev_device);
	/**
	 * Original signature : <code>udev_device* udev_device_get_parent_with_subsystem_devtype(udev_device*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:80</i><br>
	 * @deprecated use the safer methods {@link #udev_device_get_parent_with_subsystem_devtype(jlibudev.generated.udev_device, java.lang.String, java.lang.String)} and {@link #udev_device_get_parent_with_subsystem_devtype(jlibudev.generated.udev_device, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	udev_device udev_device_get_parent_with_subsystem_devtype(udev_device udev_device, Pointer subsystem, Pointer devtype);
	/**
	 * Original signature : <code>udev_device* udev_device_get_parent_with_subsystem_devtype(udev_device*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:80</i>
	 */
	udev_device udev_device_get_parent_with_subsystem_devtype(udev_device udev_device, String subsystem, String devtype);
	/**
	 * retrieve device properties<br>
	 * Original signature : <code>char* udev_device_get_devpath(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:83</i>
	 */
	String udev_device_get_devpath(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_subsystem(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:84</i>
	 */
	String udev_device_get_subsystem(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_devtype(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:85</i>
	 */
	String udev_device_get_devtype(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_syspath(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:86</i>
	 */
	String udev_device_get_syspath(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_sysname(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:87</i>
	 */
	String udev_device_get_sysname(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_sysnum(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:88</i>
	 */
	String udev_device_get_sysnum(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_devnode(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:89</i>
	 */
	String udev_device_get_devnode(udev_device udev_device);
	/**
	 * Original signature : <code>udev_list_entry* udev_device_get_devlinks_list_entry(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:90</i>
	 */
	udev_list_entry udev_device_get_devlinks_list_entry(udev_device udev_device);
	/**
	 * Original signature : <code>udev_list_entry* udev_device_get_properties_list_entry(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:91</i>
	 */
	udev_list_entry udev_device_get_properties_list_entry(udev_device udev_device);
	/**
	 * Original signature : <code>udev_list_entry* udev_device_get_tags_list_entry(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:92</i>
	 */
	udev_list_entry udev_device_get_tags_list_entry(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_property_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:93</i><br>
	 * @deprecated use the safer methods {@link #udev_device_get_property_value(jlibudev.generated.udev_device, java.lang.String)} and {@link #udev_device_get_property_value(jlibudev.generated.udev_device, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	String udev_device_get_property_value(udev_device udev_device, Pointer key);
	/**
	 * Original signature : <code>char* udev_device_get_property_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:93</i>
	 */
	String udev_device_get_property_value(udev_device udev_device, String key);
	/**
	 * Original signature : <code>char* udev_device_get_driver(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:94</i>
	 */
	String udev_device_get_driver(udev_device udev_device);
	/**
	 * Original signature : <code>dev_t udev_device_get_devnum(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:95</i>
	 */
	int udev_device_get_devnum(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_action(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:96</i>
	 */
	String udev_device_get_action(udev_device udev_device);
	/**
	 * Original signature : <code>int udev_device_get_seqnum(udev_device*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:97</i>
	 */
	long udev_device_get_seqnum(udev_device udev_device);
	/**
	 * Original signature : <code>char* udev_device_get_sysattr_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:98</i><br>
	 * @deprecated use the safer methods {@link #udev_device_get_sysattr_value(jlibudev.generated.udev_device, java.lang.String)} and {@link #udev_device_get_sysattr_value(jlibudev.generated.udev_device, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	String udev_device_get_sysattr_value(udev_device udev_device, Pointer sysattr);
	/**
	 * Original signature : <code>char* udev_device_get_sysattr_value(udev_device*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:98</i>
	 */
	String udev_device_get_sysattr_value(udev_device udev_device, String sysattr);
	/**
	 * Original signature : <code>udev_monitor* udev_monitor_ref(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:106</i>
	 */
	udev_monitor udev_monitor_ref(udev_monitor udev_monitor);
	/**
	 * Original signature : <code>void udev_monitor_unref(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:107</i>
	 */
	void udev_monitor_unref(udev_monitor udev_monitor);
	/**
	 * Original signature : <code>udev* udev_monitor_get_udev(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:108</i>
	 */
	udev udev_monitor_get_udev(udev_monitor udev_monitor);
	/**
	 * kernel and udev generated events over netlink<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_netlink(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:110</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_new_from_netlink(jlibudev.generated.udev, java.lang.String)} and {@link #udev_monitor_new_from_netlink(jlibudev.generated.udev, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	udev_monitor udev_monitor_new_from_netlink(udev udev, Pointer name);
	/**
	 * kernel and udev generated events over netlink<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_netlink(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:110</i>
	 */
	udev_monitor udev_monitor_new_from_netlink(udev udev, String name);
	/**
	 * custom socket (use netlink and filters instead)<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_socket(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:112</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_new_from_socket(jlibudev.generated.udev, java.lang.String)} and {@link #udev_monitor_new_from_socket(jlibudev.generated.udev, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	udev_monitor udev_monitor_new_from_socket(udev udev, Pointer socket_path);
	/**
	 * custom socket (use netlink and filters instead)<br>
	 * Original signature : <code>udev_monitor* udev_monitor_new_from_socket(udev*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:112</i>
	 */
	udev_monitor udev_monitor_new_from_socket(udev udev, String socket_path);
	/**
	 * bind socket<br>
	 * Original signature : <code>int udev_monitor_enable_receiving(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:114</i>
	 */
	int udev_monitor_enable_receiving(udev_monitor udev_monitor);
	/**
	 * Original signature : <code>int udev_monitor_set_receive_buffer_size(udev_monitor*, int)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:115</i>
	 */
	int udev_monitor_set_receive_buffer_size(udev_monitor udev_monitor, int size);
	/**
	 * Original signature : <code>int udev_monitor_get_fd(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:116</i>
	 */
	int udev_monitor_get_fd(udev_monitor udev_monitor);
	/**
	 * Original signature : <code>udev_device* udev_monitor_receive_device(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:117</i>
	 */
	udev_device udev_monitor_receive_device(udev_monitor udev_monitor);
	/**
	 * in-kernel socket filters to select messages that get delivered to a listener<br>
	 * Original signature : <code>int udev_monitor_filter_add_match_subsystem_devtype(udev_monitor*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:119</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_filter_add_match_subsystem_devtype(jlibudev.generated.udev_monitor, java.lang.String, java.lang.String)} and {@link #udev_monitor_filter_add_match_subsystem_devtype(jlibudev.generated.udev_monitor, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_monitor_filter_add_match_subsystem_devtype(udev_monitor udev_monitor, Pointer subsystem, Pointer devtype);
	/**
	 * in-kernel socket filters to select messages that get delivered to a listener<br>
	 * Original signature : <code>int udev_monitor_filter_add_match_subsystem_devtype(udev_monitor*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:119</i>
	 */
	int udev_monitor_filter_add_match_subsystem_devtype(udev_monitor udev_monitor, String subsystem, String devtype);
	/**
	 * Original signature : <code>int udev_monitor_filter_add_match_tag(udev_monitor*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:121</i><br>
	 * @deprecated use the safer methods {@link #udev_monitor_filter_add_match_tag(jlibudev.generated.udev_monitor, java.lang.String)} and {@link #udev_monitor_filter_add_match_tag(jlibudev.generated.udev_monitor, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_monitor_filter_add_match_tag(udev_monitor udev_monitor, Pointer tag);
	/**
	 * Original signature : <code>int udev_monitor_filter_add_match_tag(udev_monitor*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:121</i>
	 */
	int udev_monitor_filter_add_match_tag(udev_monitor udev_monitor, String tag);
	/**
	 * Original signature : <code>int udev_monitor_filter_update(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:122</i>
	 */
	int udev_monitor_filter_update(udev_monitor udev_monitor);
	/**
	 * Original signature : <code>int udev_monitor_filter_remove(udev_monitor*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:123</i>
	 */
	int udev_monitor_filter_remove(udev_monitor udev_monitor);
	/**
	 * Original signature : <code>udev_enumerate* udev_enumerate_ref(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:131</i>
	 */
	udev_enumerate udev_enumerate_ref(udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>void udev_enumerate_unref(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:132</i>
	 */
	void udev_enumerate_unref(udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>udev* udev_enumerate_get_udev(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:133</i>
	 */
	udev udev_enumerate_get_udev(udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>udev_enumerate* udev_enumerate_new(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:134</i>
	 */
	udev_enumerate udev_enumerate_new(udev udev);
	/**
	 * device properties filter<br>
	 * Original signature : <code>int udev_enumerate_add_match_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:136</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_subsystem(jlibudev.generated.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_match_subsystem(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_subsystem(udev_enumerate udev_enumerate, Pointer subsystem);
	/**
	 * device properties filter<br>
	 * Original signature : <code>int udev_enumerate_add_match_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:136</i>
	 */
	int udev_enumerate_add_match_subsystem(udev_enumerate udev_enumerate, String subsystem);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:137</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_nomatch_subsystem(jlibudev.generated.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_nomatch_subsystem(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_nomatch_subsystem(udev_enumerate udev_enumerate, Pointer subsystem);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_subsystem(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:137</i>
	 */
	int udev_enumerate_add_nomatch_subsystem(udev_enumerate udev_enumerate, String subsystem);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:138</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_sysattr(jlibudev.generated.udev_enumerate, java.lang.String, java.lang.String)} and {@link #udev_enumerate_add_match_sysattr(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_sysattr(udev_enumerate udev_enumerate, Pointer sysattr, Pointer value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:138</i>
	 */
	int udev_enumerate_add_match_sysattr(udev_enumerate udev_enumerate, String sysattr, String value);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:139</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_nomatch_sysattr(jlibudev.generated.udev_enumerate, java.lang.String, java.lang.String)} and {@link #udev_enumerate_add_nomatch_sysattr(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_nomatch_sysattr(udev_enumerate udev_enumerate, Pointer sysattr, Pointer value);
	/**
	 * Original signature : <code>int udev_enumerate_add_nomatch_sysattr(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:139</i>
	 */
	int udev_enumerate_add_nomatch_sysattr(udev_enumerate udev_enumerate, String sysattr, String value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_property(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:140</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_property(jlibudev.generated.udev_enumerate, java.lang.String, java.lang.String)} and {@link #udev_enumerate_add_match_property(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_property(udev_enumerate udev_enumerate, Pointer property, Pointer value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_property(udev_enumerate*, const char*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:140</i>
	 */
	int udev_enumerate_add_match_property(udev_enumerate udev_enumerate, String property, String value);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysname(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:141</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_sysname(jlibudev.generated.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_match_sysname(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_sysname(udev_enumerate udev_enumerate, Pointer sysname);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_sysname(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:141</i>
	 */
	int udev_enumerate_add_match_sysname(udev_enumerate udev_enumerate, String sysname);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_tag(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:142</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_match_tag(jlibudev.generated.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_match_tag(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_match_tag(udev_enumerate udev_enumerate, Pointer tag);
	/**
	 * Original signature : <code>int udev_enumerate_add_match_tag(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:142</i>
	 */
	int udev_enumerate_add_match_tag(udev_enumerate udev_enumerate, String tag);
	/**
	 * Original signature : <code>int udev_enumerate_add_syspath(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:143</i><br>
	 * @deprecated use the safer methods {@link #udev_enumerate_add_syspath(jlibudev.generated.udev_enumerate, java.lang.String)} and {@link #udev_enumerate_add_syspath(jlibudev.generated.udev_enumerate, com.sun.jna.Pointer)} instead
	 */
	@Deprecated 
	int udev_enumerate_add_syspath(udev_enumerate udev_enumerate, Pointer syspath);
	/**
	 * Original signature : <code>int udev_enumerate_add_syspath(udev_enumerate*, const char*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:143</i>
	 */
	int udev_enumerate_add_syspath(udev_enumerate udev_enumerate, String syspath);
	/**
	 * run enumeration with active filters<br>
	 * Original signature : <code>int udev_enumerate_scan_devices(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:145</i>
	 */
	int udev_enumerate_scan_devices(udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>int udev_enumerate_scan_subsystems(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:146</i>
	 */
	int udev_enumerate_scan_subsystems(udev_enumerate udev_enumerate);
	/**
	 * return device list<br>
	 * Original signature : <code>udev_list_entry* udev_enumerate_get_list_entry(udev_enumerate*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:148</i>
	 */
	udev_list_entry udev_enumerate_get_list_entry(udev_enumerate udev_enumerate);
	/**
	 * Original signature : <code>udev_queue* udev_queue_ref(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:156</i>
	 */
	udev_queue udev_queue_ref(udev_queue udev_queue);
	/**
	 * Original signature : <code>void udev_queue_unref(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:157</i>
	 */
	void udev_queue_unref(udev_queue udev_queue);
	/**
	 * Original signature : <code>udev* udev_queue_get_udev(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:158</i>
	 */
	udev udev_queue_get_udev(udev_queue udev_queue);
	/**
	 * Original signature : <code>udev_queue* udev_queue_new(udev*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:159</i>
	 */
	udev_queue udev_queue_new(udev udev);
	/**
	 * Original signature : <code>int udev_queue_get_kernel_seqnum(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:160</i>
	 */
	long udev_queue_get_kernel_seqnum(udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_udev_seqnum(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:161</i>
	 */
	long udev_queue_get_udev_seqnum(udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_udev_is_active(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:162</i>
	 */
	int udev_queue_get_udev_is_active(udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_queue_is_empty(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:163</i>
	 */
	int udev_queue_get_queue_is_empty(udev_queue udev_queue);
	/**
	 * Original signature : <code>int udev_queue_get_seqnum_is_finished(udev_queue*, unsigned long long int)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:164</i>
	 */
	int udev_queue_get_seqnum_is_finished(udev_queue udev_queue, long seqnum);
	/**
	 * Original signature : <code>int udev_queue_get_seqnum_sequence_is_finished(udev_queue*, unsigned long long int, unsigned long long int)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:165</i>
	 */
	int udev_queue_get_seqnum_sequence_is_finished(udev_queue udev_queue, long start, long end);
	/**
	 * Original signature : <code>udev_list_entry* udev_queue_get_queued_list_entry(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:167</i>
	 */
	udev_list_entry udev_queue_get_queued_list_entry(udev_queue udev_queue);
	/**
	 * Original signature : <code>udev_list_entry* udev_queue_get_failed_list_entry(udev_queue*)</code><br>
	 * <i>native declaration : target/checkout/libudev/libudev.h:168</i>
	 */
	udev_list_entry udev_queue_get_failed_list_entry(udev_queue udev_queue);
	/// Pointer to unknown (opaque) type
	public static class __u8 extends PointerType {
		public __u8(Pointer address) {
			super(address);
		}
		public __u8() {
			super();
		}
	};
	/// Pointer to unknown (opaque) type
	public static class va_list extends PointerType {
		public va_list(Pointer address) {
			super(address);
		}
		public va_list() {
			super();
		}
	};
	/// Pointer to unknown (opaque) type
	public static class __u16 extends PointerType {
		public __u16(Pointer address) {
			super(address);
		}
		public __u16() {
			super();
		}
	};
	/// Pointer to unknown (opaque) type
	public static class __u32 extends PointerType {
		public __u32(Pointer address) {
			super(address);
		}
		public __u32() {
			super();
		}
	};
	/// Pointer to unknown (opaque) type
	public static class socklen_t extends PointerType {
		public socklen_t(Pointer address) {
			super(address);
		}
		public socklen_t() {
			super();
		}
	};
	/// Pointer to unknown (opaque) type
	public static class _IO_lock_t extends PointerType {
		public _IO_lock_t(Pointer address) {
			super(address);
		}
		public _IO_lock_t() {
			super();
		}
	};
	/// Pointer to unknown (opaque) type
	public static class sa_family_t extends PointerType {
		public sa_family_t(Pointer address) {
			super(address);
		}
		public sa_family_t() {
			super();
		}
	};
	/// Pointer to unknown (opaque) type
	public static class _Bool extends PointerType {
		public _Bool(Pointer address) {
			super(address);
		}
		public _Bool() {
			super();
		}
	};
}