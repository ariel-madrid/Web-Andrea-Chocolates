<template>
    <div>
        <div class="flex flex-col">
            <nav class="sticky top-0 bg-white border-gray-200 px-2 sm:px-10 py-3 rounded dark:bg-gray-800">
                <div class="container flex flex-wrap justify-between items-center mx-auto ">
                    <a class="flex items-center">
                        <img src="../img/logo.jpeg" class="mr-3 h-6 sm:h-9" alt="Andrea Chocolates Logo" />
                        <span class="self-center text-xl font-serif font-semibold whitespace-nowrap dark:text-white">Andrea Chocolates</span>
                    </a>
                    <button data-collapse-toggle="mobile-menu" type="button" class="inline-flex items-center p-2 ml-3 text-sm text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600" aria-controls="mobile-menu" aria-expanded="false">
                    <span class="sr-only">Abrir menu principal</span>
                    <svg class="w-6 h-6" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z" clip-rule="evenodd"></path></svg>
                    <svg class="hidden w-6 h-6" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
                    </button>
                    <div class="hidden w-full md:block md:w-auto" id="mobile-menu">
                    <ul class="flex flex-col mt-4 md:flex-row md:space-x-8 md:mt-0 md:text-sm md:font-medium">
                        <li>
                        <a href="/" class="block text-gray-800 bg-transparent hover:bg-orange-300 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-orange-300 dark:hover:bg-transparent" aria-current="page">Inicio</a>
                        </li>
                        <li>
                        <a href="/productos" class="block text-gray-800 bg-transparent hover:bg-orange-300 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-orange-300 dark:hover:bg-transparent">Productos</a>
                        </li>
                        <li>
                        <a href="/contacto" class="block text-gray-800 bg-transparent hover:bg-orange-300 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-orange-300 dark:hover:bg-blue-700">Contacto</a>
                        </li>

                        <button @click="passData" class="block text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600" type="button" data-modal-toggle="defaultModal">Login</button>

                    </ul>
                    </div>
                </div>
            </nav>
        </div>
                
            <section class="relative  bg-blueGray-50">
                <div class="relative pt-16 pb-32 flex content-center items-center justify-center min-h-screen-75">
                    <div class="absolute top-0 w-full h-full bg-center bg-cover" id="fondo">
                        <span id="blackOverlay" class="w-full h-full absolute opacity-75 bg-black"></span>
                    </div>
                    <div class="container relative mx-auto">
                        <div class="items-center flex flex-wrap">
                            <div class="w-full lg:w-6/12 px-4 ml-auto mr-auto text-center">
                                <div class="pr-12">
                                    <h1 class="text-white font-semibold text-5xl">
                                    Bienvenido a Andrea Chocolates
                                    </h1>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="top-auto bottom-0 left-0 right-0 w-full absolute pointer-events-none overflow-hidden h-70-px" style="transform: translateZ(0px)">
                        <svg class="absolute bottom-0 overflow-hidden" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="none" version="1.1" viewBox="0 0 2560 100" x="0" y="0">
                            <polygon class="text-blueGray-200 fill-current" points="2560 0 2560 100 0 100"></polygon>
                        </svg>
                    </div>
                </div>

                <section class="pb-10 bg-blueGray-200 -mt-24">
                    <div class="container mx-auto px-4">
                        <div class="flex flex-wrap">
                            <div class="lg:pt-12 pt-6 w-full md:w-4/12 px-4 text-center">
                                <div class="relative flex flex-col min-w-0 break-words bg-white w-full mb-8 shadow-lg rounded-lg">
                                    <a href="#">
                                        <img class="rounded-t-lg" src="../img/alfajores.png" alt="" />
                                    </a>
                                    <div class="px-4 py-5 flex-auto">
                                        <div class="text-white p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-red-400">
                                            <i class="fas fa-award"></i>
                                        </div>
                                        <h6 class="text-xl font-semibold">Alfajores</h6>
                                        <p class="mt-2 mb-4 text-blueGray-500">
                                            Alfajores de dos o tres capas con hermosos diseños.
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="w-full md:w-4/12 px-4 text-center">
                                <div class="relative flex flex-col min-w-0 break-words bg-white w-full mb-8 shadow-lg rounded-lg">
                                    <a href="#">
                                        <img class="rounded-t-lg" src="../img/presentacion.jpeg" alt="" />
                                    </a>
                                    <div class="px-4 py-5 flex-auto">
                                        <div class="text-white p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-lightBlue-400">
                                            <i class="fas fa-retweet"></i>
                                        </div>
                                        <h6 class="text-xl font-semibold">Cuchuflis</h6>
                                        <p class="mt-2 mb-4 text-blueGray-500">
                                            Diferentes variedades de Cuchuflis bañados en chocolate.
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="pt-6 w-full md:w-4/12 px-4 text-center">
                                <div class="relative flex flex-col min-w-0 break-words bg-white w-full mb-8 shadow-lg rounded-lg">
                                    <a href="#">
                                        <img class="rounded-t-lg" src="../img/especiales.png" alt="" />
                                    </a>
                                    <div class="px-4 py-5 flex-auto">
                                        <div class="text-white p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-emerald-400">
                                            <i class="fas fa-fingerprint"></i>
                                        </div>
                                        <h6 class="text-xl font-semibold">Especiales</h6>
                                        <p class="mt-2 mb-4 text-blueGray-500">
                                            Le ofrecemos Cuchuflis, Alfajores y Paletas con diseños especiales de temporada.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <footer class="">
                        <div class="container flex flex-wrap items-center justify-center px-4 py-8 mx-auto">
                            <div class="flex justify-center mt-4 lg:mt-0">
                            <a href="https://www.facebook.com/andreachocolates2.0/" target="blank">
                                <svg
                                fill="currentColor"
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                stroke-width="2"
                                class="w-6 h-6 text-blue-600"
                                viewBox="0 0 24 24"
                                >
                                <path
                                    d="M18 2h-3a5 5 0 00-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 011-1h3z"
                                ></path>
                                </svg>
                            </a>
                            <a class="ml-3" href="https://instagram.com/andreaschocolates?igshid=YmMyMTA2M2Y=" target="blank">
                                <svg
                                fill="none"
                                stroke="currentColor"
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                stroke-width="2"
                                class="w-6 h-6 text-pink-400"
                                viewBox="0 0 24 24"
                                >
                                <rect width="20" height="20" x="2" y="2" rx="5" ry="5"></rect>
                                <path
                                    d="M16 11.37A4 4 0 1112.63 8 4 4 0 0116 11.37zm1.5-4.87h.01"
                                ></path>
                                </svg>
                            </a>
                            </div>
                        </div>
                    </footer>
                </section>
        </section>
    </div>
</template>

<script>
import Vue from 'vue'
export default {
    data() {
        return {
            toggleModal: true
        };
    },
    methods:
    {
        passData() 
        {
            this.$emit('toggleModal', this.toggleModal)
        }
    }
}
</script>