import { createRouter, createWebHistory } from 'vue-router'
import ViewPets from '../views/ViewPets.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: ViewPets
    },
    {
      path: '/add',
      name: 'add',
      component: () => import('../views/AddPet.vue')
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component: () => import('../views/UpdatePet.vue')
    }
  ]
})

export default router
