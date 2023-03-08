import { fileURLToPath, URL } from 'node:url'
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

import Components from 'unplugin-vue-components/vite';
import { AntDesignVueResolver } from 'unplugin-vue-components/resolvers';

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    Components({
      resolvers: [AntDesignVueResolver()],
    })
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  css: {
    preprocessorOptions: {
      less: {
        javascriptEnabled: true,  //注意，这一句是在less对象中，写在外边不起作用
        modifyVars: { //在这里进行主题的修改，参考官方配置属性
          '@primary-color': '#1DA57A',
        },
      }
    }
  },
  build: {
    // outDir: '../backend/src/main/resources/front',
    // emptyOutDir: true
  }
})
