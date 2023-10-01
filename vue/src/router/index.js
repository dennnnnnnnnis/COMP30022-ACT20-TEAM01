/* // The following code is the framework that comes with the scaffolding, modified and 
edited by Yawen Luo to fit the student platform. The code is the router in the paltfrom */

import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import Layout from '@/layout'

// MODIFIED BY YAWEN LUO
export const constantRoutes = [
  {
    path: '/404',
    component: () => import('@/views/404'),
    hidden: true
  },

  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [{
      path: 'dashboard',
      name: 'Dashboard',
      component: () => import('@/views/dashboard/index'),
      meta: { title: 'Dashboard', icon: 'dashboard' }
    }]
  },
  
  {
    path: '/history',
    component: Layout,
    children: [
      {
        path: 'history',
        name: 'History',
        component: () => import('@/views/history/index'),
        meta: { title: 'History', icon: 'tree' }
      }
    ]
  },

  // 404 page must be placed at the end !!!
  { path: '*', redirect: '/dashboard', hidden: true } // 不再自动重定向到 /404，而是重定向到 /dashboard
]


const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})
const router = createRouter()
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
