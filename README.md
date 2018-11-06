# andutil
Android常用工具类，包含了Android开发中经常会使用到的工具类，
这里做一个统一的整理，方便使用。

## 使用方式
Android Studio中在build.gradle文件中添加依赖
~~~gradle
api 'xyz.totok.andutil:andutil:0.0.8'
~~~

## 文件介绍
||||
|--|--|--|
|名称|文件|功能|
|Android设备各种工具|AndroidUtils|电池、文件、媒体、签名、系统服务、Toast、软键盘等|
|日志打印|LogUtils|统一格式打印，支持字符串、对象、json等|
|吐司通知|ToastUtils|使用自定义的Toast界面，美观|
|正则匹配|RegexUtils|封装了常见的正则表达式匹配规则|
|正则匹配|RegexConstants|各种正则匹配字符串|
|SharePrefrence存储|SharePresUtils|各种类型的数据存储到SharePreference|
|字符串处理|StringUtils|字符串内容判断，格式化等|
|输入输出流处理|IOUtils|读写输入输出流，文件操作等|
|网络|NetWorkUtils|手机网络状态判断|
|安装包信息|PackageUtils|包信息查看、卸载、安装、主线程判断等|
|SD卡相关|SDCardUtils|SD卡相关|
|流量统计|TrafficUtils|手机流量统计|
|解压缩|ZipUtils|压缩文件和解压文件|
|界面View工具|ViewUtils|DP和PX转换、状态栏等|
|Java反射|ReflectionUtils|Java反射|
|MIME类型|MimeUtils|MIME类型|
|图片处理|ImageUtils|图片读写、缩放、压缩等|
|加密和解密|CryptoUtils|加密和解密|
|数据转换工具|ConvertUtils|图片和字节数组转换、DP和PX转换、进制转换、输入输出流转换等|
|IO流关闭|CloseUtils|控制关闭IO流，是否需要打印异常信息|
|常用诊断|AssertUtils|是否为true、字符串是否空、null、是否是实例、序列是否空白等|
|日期|DateUtils|格式化日期、时间戳、字符串转换等|
|View宽高测量|MeasureUtils|View宽高测量|
|xml处理|XmlUtils|xml转JavaBean、获取指定标签的值|
|常用颜色值|ColorUtils|常用颜色值|
|跳转到系统组件|AndroidToActivityUtils|打电话、浏览器、分享、设置、权限等|






