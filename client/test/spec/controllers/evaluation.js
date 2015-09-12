'use strict';

describe('Controller: EvaluationCtrl', function () {

  // load the controller's module
  beforeEach(module('clientApp'));

  var EvaluationCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    EvaluationCtrl = $controller('EvaluationCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should user is a new object', function () {
    expect(EvaluationCtrl.user).toBeDefined();
  });
});
