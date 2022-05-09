<template>
    <div>
        <div v-if="!toggleModal">
            <Landing @toggleModal="dataFromChild"></Landing>
        </div>

        <div v-else class="opacity-25">
            <Landing></Landing>
        </div>

    <!--- Se pueden usar las clases de Tailwind --->
        <div v-if="toggleModal" id="defaultModal" class="fixed overflow-x-hidden overflow-y-auto inset-0 flex justify-center items-center z-50">
                                  
            <FormulateForm
                class="bg-white shadow-sm p-5 rounded max-w-sm ml-2 border border-gray-200"
                @submit="submitHandler"
                #default="{ isLoading }">
                <div class="flex items-center text-gray-500 hover:text-gray-600 dark:text-white cursor-pointer">
                            <img class="mb-5 dark:hidden" src="https://tuk-cdn.s3.amazonaws.com/can-uploader/shopping-cart-1-svg1.svg" alt="previous"/>
                             <img class="mb-5 dark:block hidden" src="https://tuk-cdn.s3.amazonaws.com/can-uploader/shopping-cart-1-svg1dark.svg" alt="previous"/>
                            <button id="back" @click="toggleModal=false" class="mb-5 text-sm pl-2 leading-none dark:hover:text-gray-200">Volver</button>
                </div>         
                <h3 class="w-full text-2xl font-bold text-center mb-5 font-mono underline decoration-sky-500 truncate">Iniciar Sesión</h3>
                    <FormulateInput class="bg-green-200 rounded p-2 pb-5 mb-2"
                    label="Nombre de Usuario"
                    name="Nombre"
                    validation="required"
                    />
                    <FormulateInput class="bg-green-200 rounded p-2 pb-5 mb-2"
                    label="Contraseña"
                    name="Contraseña"
                    validation="required"
                    />
                    <div class="grid grid-rows-1 grid-flow-row justify-center">
                        <FormulateInput class="text-center text-white w-36 mt-5 bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 mr-2 mb-2 dark:bg-blue-600 dark:hover:bg-blue-700 focus:outline-none dark:focus:ring-blue-800"
                        type="submit"
                        :disabled="isLoading"
                        :label="isLoading ? 'Cargando...' : 'Ingresar'"
                        />
                    </div>
            </FormulateForm>
        </div>
    </div>
</template>

<script>
import Vue from 'vue'
import VueFormulate from '@braid/vue-formulate'
import Landing from './Landing.vue'
Vue.use(VueFormulate)
export default {
    name: "modal",
    data() {
        return {
            toggleModal: null
        };
    },
    methods: {
        async submitHandler(data) {
            await this.$axios.post("/my/api", data);
            alert(`Thank you, ${data.name}`);
        },
        dataFromChild(value)
        {
            this.toggleModal = value
        }
    },
    components: { Landing }
}
</script>

<style>
    @import url('../assets/style-principal.css');
</style>