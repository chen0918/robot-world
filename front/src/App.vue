<script>
  import axios from 'axios'
  import HelloWorld from './components/HelloWorld.vue'
  export default {
    data() {
      return {
        count: 0,
        msg: "Hello World",
        rawHtml: '<span style="color: red">This should be red.</span>',
        isButtonDisabled: true,
        number: 10,
        ok: false,
        id: 1234,
        seen: true,
        items: ['a', 'b', 'c'],
        myObject: {
          title: 'How to do lists in Vue',
          author: 'Jane Doe',
          publishedAt: '2016-04-10'
        },
        numbers: [1, 2, 3, 4, 5],
        resp: null,
        showResp: false
      }
    },
    methods: {
      greet(event) {
        // 方法中的 `this` 指向当前活跃的组件实例
        alert(`Hello ${this.msg}!`)
        // `event` 是 DOM 原生事件
        if (event) {
          console.log(event);
        }
      },
      getUser(id) {
        axios
          .get('http://localhost/users/'+id)
          .then(
            response => {
              this.resp = response;
              this.showResp = true;
            }
          )
          .catch(function (error) { // 请求失败处理
            console.log(error);
          });
      }
    },
    computed: {
      evenNumbers() {
        return this.numbers.filter(n => n % 2 === 0)
      }
    },
    updated() {
      // alert("updated");
    }
  }
</script>

<template>
  <header>
  </header>

  <main>
    <div id="app">
      <div v-if="showResp">
        <pre>
          {{ resp.data }}
        </pre>
      </div>
      <button @click="getUser(1)">axiosTest</button>

      <input v-model="msg">
      <input v-model.lazy="msg">
      <p><span>Message: {{msg}}</span></p>
      <p>Using text interpolation: {{ rawHtml }}</p>
      <p>Using v-html directive: <span v-html="rawHtml"></span></p>
      <p><button @click="count++">{{ count }}</button></p>
      <div v-bind:id="msg"></div>
      <p><button :disabled="isButtonDisabled">Button</button></p>
      {{ number + 1 }}
      {{ ok ? 'YES' : 'NO' }}
      {{ msg.split('').reverse().join('') }}
      <div :id="`list-${id}`">111</div>
      <p v-if="seen">Now you see me</p>
      <p v-for="(item,index) in items">{{ index+":"+item}}</p>
      <p v-for="(v,k) in myObject">{{ k+": "+v }}</p>
      <p v-for="i in 5">{{ i }}</p>
      <li v-for="n in evenNumbers">{{ n }}</li>
      <!-- `greet` 是上面定义过的方法名 -->
      <button @click="greet">Greet</button>

    </div>
  </main>
</template>

<style scoped>

</style>