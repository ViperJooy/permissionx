# permssionx
a open source library for apply permission implemented with kotlin
使用kotlin实现的获取手机权限的library,
使用方式

1 引入
implementation 'com.viper.permisssionx:permissionx:1.0.0'

2 使用

PermissionX.request(this, Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
                if (allGranted) {
                  //dosomething
                } else {
                    Toast.makeText(this, "请授予相应权限", Toast.LENGTH_SHORT).show()
                }
            }
