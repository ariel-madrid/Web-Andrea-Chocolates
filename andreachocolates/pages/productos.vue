<template>
  <div>
      <div class="navbar">
            <nav class="bg-white border-gray-200 px-2 sm:px-10 py-3 rounded dark:bg-gray-800">
                <div class="container flex flex-wrap justify-between items-center mx-auto">
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
                        <a href="/" class="block py-2 pr-4 pl-3 text-white bg-blue-700 rounded md:bg-transparent md:text-blue-700 md:p-0 dark:text-white" aria-current="page">Inicio</a>
                        </li>
                        <li>
                        <a href="/productos" class="block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700">Productos</a>
                        </li>
                        <li>
                        <a href="/contacto" class="block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700">Contacto</a>
                        </li>
                    </ul>
                    </div>
                </div>
            </nav>
        </div>

        <div class="grid grid-rows-1 grid-flow-row justify-center">
            <div class="w-80 mt-10 ml-10 mr-10 bg-white border-gray-200 px-2 sm:px-10 py-3 rounded dark:bg-gray-800 text-center">
                <h2>Lista de Productos</h2> 
            </div>
        </div>
        <!-- Barra lateral que dispone los filtros -->

        <div class="grid grid-rows-2 grid-flow-col gap-4">

            <div class="hidden md:block md:w-64 row-span-3 bg-white rounded m-10 relative h-80 w-32">
                <div class="absolute inset-y-0 left-0 w-24 ml-5 mt-5"> 
                    <div><h3>Filtrar por</h3></div>

                    <ul class="flow-root mt-5 w-48 text-sm font-medium text-gray-900 bg-white border border-gray-200 rounded-lg dark:bg-gray-700 dark:border-gray-600 dark:text-white ">
                        <li class="float-left w-full px-4 py-2 border-b border-gray-200 rounded-t-lg dark:border-gray-600">Cuchuflis <input class="float-right" type="checkbox"></li>
                        <li class="float-left w-full px-4 py-2 border-b border-gray-200 dark:border-gray-600">Alfajores <input class="float-right" type="checkbox"></li>
                        <li class="float-left w-full px-4 py-2 border-b border-gray-200 dark:border-gray-600">Paletas <input class="float-right" type="checkbox"></li>
                        <li class="float-left w-full px-4 py-2 rounded-b-lg">Especiales <input class="float-right" type="checkbox"></li>
                    </ul>
                    <button class="m-5 w-40 bg-transparent hover:bg-blue-500 text-blue-700 font-semibold hover:text-white py-2 px-4 border border-blue-500 hover:border-transparent rounded">Aplicar Filtro</button>
                </div>
            </div>

            <div class="row-span-2 col-span-2 flex col-start-2 col-end-4 content-end">
            <!-- Tarjeta que muestra los productos -->
            <div class="flex flex-wrap m-10">
                <div class="ml-10 mb-10 w-60 h-100 rounded overflow-hidden shadow-2xl" v-for="(value,index) in datos" :key="index">
                    <img class="translate-x-6 w-full" src="../img/logo.jpeg" alt="Sunset in the mountains">
                    <div class="h-40 bg-blue-300 px-8 py-4">
                        <div class="flow-root font-bold text-xl mb-2">{{value.Producto}}</div>
                        <p class="text-black text-base">
                            {{value.Descripcion}}
                        </p>
                        <button class="float-left mt-5 w-40 bg-transparent hover:bg-blue-500 text-blue-700 font-semibold hover:text-white py-2 px-4 border border-blue-500 hover:border-transparent rounded">Añadir al carrito</button>
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
  </div>
</template>

<script>
export default {
    data()
    {
        return {
            datos: [{Producto:"Cuchufli",Descripcion:"Paleta de chocolate"},
                {Producto:"Alfajor",Descripcion:"Paleta de chocolate"},
                {Producto:"Paleta",Descripcion:"Paleta de chocolate"},
                {Producto:"Paleta",Descripcion:"Paleta de chocolate"},
                {Producto:"Paleta",Descripcion:"Paleta de chocolate"},
                {Producto:"Paleta",Descripcion:"Paleta de chocolate"},
                {Producto:"Paleta",Descripcion:"Paleta de chocolate"},
                {Producto:"Paleta",Descripcion:"Paleta de chocolate"}
                ]
        }   
    }
}
</script>

<style>

</style>