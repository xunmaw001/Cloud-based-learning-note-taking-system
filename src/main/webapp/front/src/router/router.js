import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import bijibenList from '../pages/bijiben/list'
import bijibenDetail from '../pages/bijiben/detail'
import bijibenAdd from '../pages/bijiben/add'
import bijifenxiangList from '../pages/bijifenxiang/list'
import bijifenxiangDetail from '../pages/bijifenxiang/detail'
import bijifenxiangAdd from '../pages/bijifenxiang/add'
import fenxiangleixingList from '../pages/fenxiangleixing/list'
import fenxiangleixingDetail from '../pages/fenxiangleixing/detail'
import fenxiangleixingAdd from '../pages/fenxiangleixing/add'
import xuexiziliaoList from '../pages/xuexiziliao/list'
import xuexiziliaoDetail from '../pages/xuexiziliao/detail'
import xuexiziliaoAdd from '../pages/xuexiziliao/add'
import goumaiziliaoList from '../pages/goumaiziliao/list'
import goumaiziliaoDetail from '../pages/goumaiziliao/detail'
import goumaiziliaoAdd from '../pages/goumaiziliao/add'
import wanzhengziliaoList from '../pages/wanzhengziliao/list'
import wanzhengziliaoDetail from '../pages/wanzhengziliao/detail'
import wanzhengziliaoAdd from '../pages/wanzhengziliao/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'bijiben',
					component: bijibenList
				},
				{
					path: 'bijibenDetail',
					component: bijibenDetail
				},
				{
					path: 'bijibenAdd',
					component: bijibenAdd
				},
				{
					path: 'bijifenxiang',
					component: bijifenxiangList
				},
				{
					path: 'bijifenxiangDetail',
					component: bijifenxiangDetail
				},
				{
					path: 'bijifenxiangAdd',
					component: bijifenxiangAdd
				},
				{
					path: 'fenxiangleixing',
					component: fenxiangleixingList
				},
				{
					path: 'fenxiangleixingDetail',
					component: fenxiangleixingDetail
				},
				{
					path: 'fenxiangleixingAdd',
					component: fenxiangleixingAdd
				},
				{
					path: 'xuexiziliao',
					component: xuexiziliaoList
				},
				{
					path: 'xuexiziliaoDetail',
					component: xuexiziliaoDetail
				},
				{
					path: 'xuexiziliaoAdd',
					component: xuexiziliaoAdd
				},
				{
					path: 'goumaiziliao',
					component: goumaiziliaoList
				},
				{
					path: 'goumaiziliaoDetail',
					component: goumaiziliaoDetail
				},
				{
					path: 'goumaiziliaoAdd',
					component: goumaiziliaoAdd
				},
				{
					path: 'wanzhengziliao',
					component: wanzhengziliaoList
				},
				{
					path: 'wanzhengziliaoDetail',
					component: wanzhengziliaoDetail
				},
				{
					path: 'wanzhengziliaoAdd',
					component: wanzhengziliaoAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
