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
                        <li>
                        <button id="abrir" @click="openCart" class="block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700">Carrito</button>
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
                <div class="ml-10 mb-10 w-60 h-100 rounded overflow-hidden shadow-2xl" v-for="(value,index) in productos" :key="index">
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

        <!--Carro de compras-->
        <div hidden class="w-full h-full bg-black dark:bg-gray-900 bg-opacity-90 top-0 overflow-y-auto overflow-x-hidden fixed sticky-0" id="chec-div">
            <div class="w-full absolute z-10 right-0 h-full overflow-x-hidden transform translate-x-0 transition ease-in-out duration-700" id="checkout">
                <div class="flex items-end lg:flex-row flex-col justify-end" id="cart">
                    <div class="lg:w-1/2 md:w-8/12 w-full lg:px-8 lg:py-14 md:px-6 px-4 md:py-8 py-4 bg-white dark:bg-gray-800 overflow-y-hidden overflow-x-hidden lg:h-screen h-auto" id="scroll">
                        <div class="flex items-center text-gray-500 hover:text-gray-600 dark:text-white cursor-pointer">
                            <img class="dark:hidden" src="https://tuk-cdn.s3.amazonaws.com/can-uploader/shopping-cart-1-svg1.svg" alt="previous"/>
                             <img class="dark:block hidden" src="https://tuk-cdn.s3.amazonaws.com/can-uploader/shopping-cart-1-svg1dark.svg" alt="previous"/>
                            <button id="back" @click="regresar" class="text-sm pl-2 leading-none dark:hover:text-gray-200">Regresar</button>
                        </div>
                        <p class="lg:text-4xl text-3xl font-black leading-10 text-gray-800 dark:text-white pt-3">Productos</p>

                        <!--Este div debe llevar un for-->
                        <div class="md:flex items-strech py-8 md:py-10 lg:py-8 border-t border-gray-50">
                            <div class="md:w-4/12 2xl:w-1/4 w-full">
                                <img src="../img/alfajores.png" alt="Black Leather Bag" class="h-full object-center object-cover md:block hidden" />
                                <img src="../img/alfajores.png" alt="Black Leather Bag" class="md:hidden w-full h-full object-center object-cover" />
                            </div>
                            <div class="md:pl-3 md:w-8/12 2xl:w-3/4 flex flex-col justify-center">
                                <div class="flex items-center justify-between w-full pt-1">
                                    <p class="text-base font-black leading-none text-gray-800 dark:text-white">North wolf bag</p>
                                    <select aria-label="Select quantity" class="py-2 px-1 border border-gray-200 mr-6 focus:outline-none dark:bg-gray-800 dark:hover:bg-gray-700 dark:text-white">
                                        <option>01</option>
                                        <option>02</option>
                                        <option>03</option>
                                    </select>
                                </div>
                                <p class="text-xs leading-3 text-gray-600 dark:text-white pt-2">Height: 10 inches</p>
                                <p class="text-xs leading-3 text-gray-600 dark:text-white py-4">Color: Black</p>
                                <p class="w-96 text-xs leading-3 text-gray-600 dark:text-white">Composition: 100% calf leather</p>
                                <div class="flex items-center justify-between pt-5">
                                    <div class="flex itemms-center">
                                        <p class="text-xs leading-3 underline text-red-500 pl-5 cursor-pointer">Eliminar</p>
                                    </div>
                                    <p class="text-base font-black leading-none text-gray-800 dark:text-white">$9,000</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--Resumen de compra-->
                    <div class="lg:w-96 md:w-8/12 w-full bg-gray-100 dark:bg-gray-900 h-full">
                        <div class="flex flex-col lg:h-screen h-auto lg:px-8 md:px-7 px-4 lg:py-20 md:py-10 py-6 justify-between overflow-y-auto">
                            <div>
                                <p class="lg:text-4xl text-3xl font-black leading-9 text-gray-800 dark:text-white">Resumen de compra</p>
                                <div class="flex items-center justify-between pt-16">
                                    <p class="text-base leading-none text-gray-800 dark:text-white">Subtotal</p>
                                    <p class="text-base leading-none text-gray-800 dark:text-white">$9,000</p>
                                </div>
                                <div class="flex items-center justify-between pt-5">
                                    <p class="text-base leading-none text-gray-800 dark:text-white">Envio</p>
                                    <p class="text-base leading-none text-gray-800 dark:text-white">$30</p>
                                </div>
                            </div>
                            <div>
                                <div class="flex items-center pb-6 justify-between lg:pt-5 pt-20">
                                    <p class="text-2xl leading-normal text-gray-800 dark:text-white">Total</p>
                                    <p class="text-2xl font-bold leading-normal text-right text-gray-800 dark:text-white">$10,240</p>
                                </div>
                                <button id="checkout" @click="realizarPedido(true)" class="text-base leading-none w-full py-5 bg-gray-800 border-gray-800 border focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-gray-800 text-white dark:hover:bg-gray-700">Realizar pedido</button>
                            </div>
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
    data() {
        return {
            productos: [
                { Producto: "Cuchufli", Descripcion: "Paleta de chocolate" },
                { Producto: "Alfajor", Descripcion: "Paleta de chocolate" },
                { Producto: "Paleta", Descripcion: "Paleta de chocolate" },
                { Producto: "Paleta", Descripcion: "Paleta de chocolate" },
                { Producto: "Paleta", Descripcion: "Paleta de chocolate" },
                { Producto: "Paleta", Descripcion: "Paleta de chocolate" },
                { Producto: "Paleta", Descripcion: "Paleta de chocolate" },
                { Producto: "Paleta", Descripcion: "Paleta de chocolate" }
            ]
        };
    },
    methods: 
    {
        openCart() 
        {
            document.getElementById("chec-div").style.display = "block";
        },
        click()
        {
            const btn = document.getElementById("abrir")
            btn.addEventListener("click",openCart)
        },
        realizarPedido(estado)
        {
            if (estado)
            {
                alert("Pedido realizado con exito")
            }
        },
        checkout()
        {
            btn = document.getElementById("checkout")
            btn.addEventListener("click",this.realizarPedido)
        },
        
        regresar()
        {
            document.getElementById("chec-div").style.display = "none";
        }
    }
}
</script>

<style>

</style>