<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Marten - Pet Food eCommerce Bootstrap4 Template</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/frontstage/img/favicon.png">

    <!-- all css here -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/simple-line-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/themify-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/jquery-ui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/meanmenu.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/frontstage/css/responsive.css">
    <script src="${pageContext.request.contextPath}/static/frontstage/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
    <%@include file="/templates/frontstage/common/header.jsp"%>
    <div class="breadcrumb-area pt-95 pb-95 bg-img" style="background-image:url(${pageContext.request.contextPath}/static/frontstage/img/banner/banner-2.jpg);">
        <div class="container">
            <div class="breadcrumb-content text-center">
                <h2>Shop Page</h2>
                <ul>
                    <li><a href="index.html">home</a></li>
                    <li class="active">Shop Page</li>
                </ul>
            </div>
        </div>
    </div>
    <div class="shop-area pt-100 pb-100 gray-bg">
        <div class="container">
            <div class="row flex-row-reverse">
                <div class="col-lg-9">
                    <div class="shop-topbar-wrapper">
                        <div class="product-sorting-wrapper">
                            <div class="product-show shorting-style">
                                <label>Showing <span>1-20</span> of <span>100</span> Results</label>
                                <select>
                                    <option value="">12</option>
                                    <option value="">24</option>
                                    <option value="">36</option>
                                </select>
                            </div>
                        </div>
                        <div class="grid-list-options">
                            <ul class="view-mode">
                                <li><a href="#product-grid" data-view="product-grid"><i
                                            class="ti-layout-grid4-alt"></i></a></li>
                                <li class="active"><a href="#product-list" data-view="product-list"><i
                                            class="ti-align-justify"></i></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="grid-list-product-wrapper">
                        <div class="product-view product-list">
                            <div class="row">
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-4.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$20.00 </span>
                                                <span class="old">$50.00</span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$19.00 </span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-5.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Cat Buffalo Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$22.00 </span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$20.00 </span>
                                                <span class="old">$50.00</span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-6.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Legacy Dog Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$50.00 </span>
                                                <span class="old">$70.00</span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$30.00 </span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-7.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Chicken Dry Cat Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$60.00 </span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$50.00 </span>
                                                <span class="old">$60.00</span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-8.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Stomach Dog Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$70.00 </span>
                                                <span class="old">$90.00</span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$25.00 </span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-9.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Nourish Puppy Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$80.00 </span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$40.00 </span>
                                                <span class="old">$70.00</span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-10.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Tarpaulin Dog Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$10.00 </span>
                                                <span class="old">$30.00</span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$30.00 </span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-11.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$22.00 </span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$19.00 </span>
                                                <span class="old">$20.00</span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="product-width col-lg-6 col-xl-4 col-md-6 col-sm-6">
                                    <div class="product-wrapper mb-10">
                                        <div class="product-img">
                                            <a href="product-details.html">
                                                <img src="${pageContext.request.contextPath}/static/frontstage/img/product/product-4.jpg" alt="">
                                            </a>
                                            <div class="product-action">
                                                <a title="Quick View" data-toggle="modal" data-target="#exampleModal"
                                                    href="#">
                                                    <i class="ti-plus"></i>
                                                </a>
                                                <a title="Add To Cart" href="#">
                                                    <i class="ti-shopping-cart"></i>
                                                </a>
                                            </div>
                                            <div class="product-action-wishlist">
                                                <a title="Wishlist" href="#">
                                                    <i class="ti-heart"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="product-content">
                                            <h4><a href="product-details.html">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$20.00 </span>
                                                <span class="old">$50.00</span>
                                            </div>
                                        </div>
                                        <div class="product-list-content">
                                            <h4><a href="#">Dog Calcium Food</a></h4>
                                            <div class="product-price">
                                                <span class="new">$19.00 </span>
                                            </div>
                                            <p>Lorem ipsum dolor sit amet, consect adipis elit, sed do eiusmod tempor
                                                incididu ut labore et dolore magna aliqua. Ut enim ad quis nostrud
                                                exerci ullamco laboris nisi ut aliquip ex ea commodo consequat, Duis
                                                aute irure dolor.</p>
                                            <div class="product-list-action">
                                                <div class="product-list-action-left">
                                                    <a class="addtocart-btn" title="Add to cart" href="#"><i
                                                            class="ion-bag"></i> Add to cart</a>
                                                </div>
                                                <div class="product-list-action-right">
                                                    <a title="Wishlist" href="#"><i class="ti-heart"></i></a>
                                                    <a title="Quick View" data-toggle="modal"
                                                        data-target="#exampleModal" href="#"><i class="ti-plus"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="pagination-style text-center mt-10">
                                <ul>
                                    <li>
                                        <a href="#"><i class="icon-arrow-left"></i></a>
                                    </li>
                                    <li>
                                        <a href="#">1</a>
                                    </li>
                                    <li>
                                        <a href="#">2</a>
                                    </li>
                                    <li>
                                        <a class="active" href="#"><i class="icon-arrow-right"></i></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="shop-sidebar">
                        <div class="shop-widget">
                            <h4 class="shop-sidebar-title">Search Products</h4>
                            <div class="shop-search mt-25 mb-50">
                                <form class="shop-search-form">
                                    <input type="text" placeholder="Find a product">
                                    <button type="submit">
                                        <i class="icon-magnifier"></i>
                                    </button>
                                </form>
                            </div>
                        </div>
                        <div class="shop-widget">
                            <h4 class="shop-sidebar-title">Filter By Price</h4>
                            <div class="price_filter mt-25">
                                <div id="slider-range"></div>
                                <div class="price_slider_amount">
                                    <div class="label-input">
                                        <label>price : </label>
                                        <input type="text" id="amount" name="price" placeholder="Add Your Price" />
                                    </div>
                                    <button type="button">Filter</button>
                                </div>
                            </div>
                        </div>
                        <div class="shop-widget mt-50">
                            <h4 class="shop-sidebar-title">Food Category </h4>
                            <div class="shop-list-style mt-20">
                                <ul>
                                    <li><a href="#">Canned Food</a></li>
                                    <li><a href="#">Dry Food</a></li>
                                    <li><a href="#">Food Pouches</a></li>
                                    <li><a href="#">Food Toppers</a></li>
                                    <li><a href="#">Fresh Food</a></li>
                                    <li><a href="#">Frozen Food</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="shop-widget mt-50">
                            <h4 class="shop-sidebar-title">Top Brands </h4>
                            <div class="shop-list-style mt-20">
                                <ul>
                                    <li><a href="#">Authority</a></li>
                                    <li><a href="#">AvoDerm Natural</a></li>
                                    <li><a href="#">Bil-Jac</a></li>
                                    <li><a href="#">Blue Buffalo</a></li>
                                    <li><a href="#">Castor & Pollux</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="shop-widget mt-50">
                            <h4 class="shop-sidebar-title">Health Consideration </h4>
                            <div class="shop-list-style mt-20">
                                <ul>
                                    <li><a href="#">Bone Development <span>18</span></a></li>
                                    <li><a href="#">Digestive Care <span>22</span></a></li>
                                    <li><a href="#">General Health <span>19</span></a></li>
                                    <li><a href="#">Hip & Joint <span>41</span></a></li>
                                    <li><a href="#">Immune System <span>22</span></a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="shop-widget mt-50">
                            <h4 class="shop-sidebar-title">Nutritional Option </h4>
                            <div class="shop-list-style mt-20">
                                <ul>
                                    <li><a href="#">Grain Free <span>18</span></a></li>
                                    <li><a href="#">Natural <span>22</span></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@include file="/templates/frontstage/common/footer.jsp"%>
    



    <!-- all js here -->
    <script src="${pageContext.request.contextPath}/static/frontstage/js/vendor/jquery-1.12.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/popper.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/jquery.counterup.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/waypoints.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/elevetezoom.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/ajax-mail.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/plugins.js"></script>
    <script src="${pageContext.request.contextPath}/static/frontstage/js/main.js"></script>
</body>

</html>