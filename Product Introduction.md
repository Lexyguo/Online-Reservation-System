# 企业订餐系统
## 前台
### 一、用户注册及登录
#### 1.登录
##### (1).方法一【基础功能】
        用户名：工号
        密码：pwd

##### （2）方法二【可拓展功能板块】
        用户名：手机号
        短信验证码：发到手机上的号码

#### 2、注册
        * 姓名、工号、手机号、密码、确认密码、手机验证码，员工卡实名认证

### 二、菜品浏览与搜索（前台）
        - 以列表（tableview）形式陈列当前时段的全部菜品
        - 边侧（左边或者右边）可按荤、素等分类【或者以菜品价格分类】
        - 列表顶部设置搜索框，可搜索想要的指定菜品

### 三、点菜与结算（前台）
#### 1、点菜
        （1）订餐帮助：详细说明预订时间限制和用餐时间等
        （2）点菜前选择单人模式或者多人模式（开在同一张单号里，待拓展）
        （3）添加到下单用户的购物车内

#### 2、结算
        （1）根据预定成功的单子内容来计算价格
        （2) 预定成功的订单记录在最后结算的用户订单信息里

#### 3、收藏（附加需求）
        （1）自定义常点菜品
        （2）自定义常点套餐（懒得选菜的时候，可随便选一个收藏了自己定义的爱吃菜的套餐）

### 四、个人信息修改（前台）
      	个人资料修改（可修改项电话，密码等个人信息）

### 五、历史订单查看（前台）
        1、过去已结束（过了预定时间）订单的信息（详细时间、点单菜品、价格……）
        2、还未结束订单查询（可在指定时间内取消订单）

*个人建议：四和五可在一个类似于个人中心的界面链接可得*

## 后台
### 一、用户管理
        1、用户的增删改查（有权限用户）
        2、用户名称、工号、部门、电话号码、密码、消费金额（可按时间区间进行结算）
        3、用户可订餐时间安排设置。

### 二、菜品管理
        1、菜品的增删改查
        2、菜品的名称、价格、原料、生产日期、历史总预定量……
        3、当日公布的菜品列表

### 三、原料管理
        1、原料的增删改查（有权限用户）
        2、原料类别、库存量、入库日期、时鲜类原料的状态（是否变质）……

### 四、订单浏览
        1、	全部订单展示：订单时间、创建用户、结算金额、付款用户
        2、	指定时间区间订单展示

### 五、订单数据汇总
        1、订餐订单数据只能查询
        2、订单的单号、出单日期、结算额、付款用户、……
        3、年度、月度、或者指定区间内订单的汇总结算

### 六、套餐管理
        1、套餐的增删改查
        2、套餐的菜品、价格、有效时间、每单可订购套餐数

