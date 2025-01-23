import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import goumaiziliao from '@/views/modules/goumaiziliao/list'
    import discussxuexiziliao from '@/views/modules/discussxuexiziliao/list'
    import bijiben from '@/views/modules/bijiben/list'
    import wanzhengziliao from '@/views/modules/wanzhengziliao/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import bijifenxiang from '@/views/modules/bijifenxiang/list'
    import discussbijifenxiang from '@/views/modules/discussbijifenxiang/list'
    import xuexiziliao from '@/views/modules/xuexiziliao/list'
    import fenxiangleixing from '@/views/modules/fenxiangleixing/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/goumaiziliao',
        name: '购买资料',
        component: goumaiziliao
      }
      ,{
	path: '/discussxuexiziliao',
        name: '学习资料评论',
        component: discussxuexiziliao
      }
      ,{
	path: '/bijiben',
        name: '笔记本',
        component: bijiben
      }
      ,{
	path: '/wanzhengziliao',
        name: '完整资料',
        component: wanzhengziliao
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/bijifenxiang',
        name: '笔记分享',
        component: bijifenxiang
      }
      ,{
	path: '/discussbijifenxiang',
        name: '笔记分享评论',
        component: discussbijifenxiang
      }
      ,{
	path: '/xuexiziliao',
        name: '学习资料',
        component: xuexiziliao
      }
      ,{
	path: '/fenxiangleixing',
        name: '分享类型',
        component: fenxiangleixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
