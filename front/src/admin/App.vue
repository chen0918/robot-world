<script>
  import { UserOutlined, VideoCameraOutlined, UploadOutlined, MenuUnfoldOutlined, MenuFoldOutlined } from '@ant-design/icons-vue';
  import { defineComponent, ref } from 'vue';
  import Content from './components/UsersAdmin.vue'
  import Page2 from './components/Page2.vue'
  import Page3 from './components/Page3.vue'
  export default defineComponent({
    components: {
      UserOutlined,
      VideoCameraOutlined,
      UploadOutlined,
      MenuUnfoldOutlined,
      MenuFoldOutlined,
      Content
    },
    setup() {
      return {
        selectedKeys: ref(['1']),
        collapsed: ref(false),
        pages: {
          '1': Content,
          '2': Page2,
          '3': Page3
        }
      };
    },
  });
</script>
<template>
  <a-back-top />
  <a-layout style="min-height: 100%;">
    <a-layout-sider v-model:collapsed="collapsed" :trigger="null" collapsible>
      <div class="logo" />
      <a-menu v-model:selectedKeys="selectedKeys" theme="dark" mode="inline">
        <a-menu-item key="1">
          <user-outlined />
          <span>nav 1</span>
        </a-menu-item>
        <a-menu-item key="2">
          <video-camera-outlined />
          <span>nav 2</span>
        </a-menu-item>
        <a-menu-item key="3">
          <upload-outlined />
          <span>nav 3</span>
        </a-menu-item>
      </a-menu>
    </a-layout-sider>
    <a-layout>
      <a-layout-header style="background: #fff; padding: 0">
        <menu-unfold-outlined v-if="collapsed" class="trigger" @click="() => (collapsed = !collapsed)" />
        <menu-fold-outlined v-else class="trigger" @click="() => (collapsed = !collapsed)" />
      </a-layout-header>
      <a-layout-content :style="{ margin: '24px 16px', padding: '24px', background: '#fff', minHeight: '280px' }">
        <!-- <Content /> -->
        <component :is="pages[selectedKeys]" />
      </a-layout-content>
    </a-layout>
  </a-layout>
</template>


<style>
  .trigger {
    font-size: 18px;
    line-height: 64px;
    padding: 0 24px;
    cursor: pointer;
    transition: color 0.3s;
  }

  .trigger:hover {
    color: #1890ff;
  }

  .logo {
    height: 32px;
    background: url("https://sponsors.vuejs.org/images/vuemastery.png") no-repeat;
    background-size: 80%;
    margin: 16px;
  }

  .site-layout .site-layout-background {
    background: #fff;
  }
</style>